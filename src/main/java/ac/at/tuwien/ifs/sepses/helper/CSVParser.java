package ac.at.tuwien.ifs.sepses.helper;

import com.taxonic.carml.engine.RmlMapper;
import com.taxonic.carml.logical_source_resolver.CsvResolver;
import com.taxonic.carml.model.TriplesMap;
import com.taxonic.carml.util.RmlMappingLoader;
import com.taxonic.carml.vocab.Rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;

import java.io.*;
import java.util.Set;

public class CSVParser {

    /**
     * return turtle file name generated with caRML and RML mappings.
     *
     * @param csvFileName
     * @param rmlFile
     * @return
     * @throws IOException
     */
	
	
    public static Model Parse(String csvFileName, String rmlFile) throws IOException {

    	System.out.println(csvFileName+" "+rmlFile);
        // load RML file and all supporting functions
        InputStream is = CSVParser.class.getClassLoader().getResourceAsStream(rmlFile);
        Set<TriplesMap> mapping = RmlMappingLoader.build().load(RDFFormat.TURTLE, is);
        RmlMapper mapper = RmlMapper.newBuilder().setLogicalSourceResolver(Rdf.Ql.Csv, new CsvResolver()).build();
        
        // load input file and convert it to RDF
        InputStream instances = new FileInputStream(csvFileName);
        mapper.bindInputStream(instances);

        // write it out to an turtle file
        org.eclipse.rdf4j.model.Model sesameModel = mapper.map(mapping);
        is.close();
        instances.close();
        //System.out.print(sesameModel.toString());

        // create a temp file and return jena model
        File file = File.createTempFile("modelsdfsfsssssss", ".ttl");
        file.deleteOnExit();
        OutputStream tempOutput = new FileOutputStream(file);
        Rio.write(sesameModel, tempOutput, RDFFormat.TURTLE); // write mapping
        sesameModel.clear();
        tempOutput.flush();
        tempOutput.close();

        // create jena model
        Model models = ModelFactory.createDefaultModel();
        //models.setNsPrefixes(Utility.getPrefixes());
        InputStream tempInput = new FileInputStream(file);
        RDFDataMgr.read(models, tempInput, Lang.TURTLE);
        tempInput.close();
        //models.write(System.out,"TURTLE");
       // model.close();
        return models;
    }
    
    public static void main(String[] args) throws IOException {
    	String csvData="D:\\SANDBOX\\csv.json";
    	String rmlFile="rml2/cve-json.rml";
    	Parse(csvData,rmlFile);
    }
}
