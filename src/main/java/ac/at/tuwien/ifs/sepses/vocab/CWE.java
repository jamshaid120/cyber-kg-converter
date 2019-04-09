package ac.at.tuwien.ifs.sepses.vocab;/* CVS $Id: $ */

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

/**
 * Vocabulary definitions from file:/Users/juang/CodeRepo/Sepses/cyber-kb/src/main/resources/owl/CWE.ttl 
 * @author Auto-generated by schemagen on 09 Apr 2019 09:07 
 */
public class CWE {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://w3id.org/sepses/vocab/ref/cwe#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Property ABSTRACTION = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#abstraction" );
    
    public static final Property APPLICABLE_PLATFORM_LANGUAGE = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#applicablePlatformLanguage" );
    
    public static final Property APPLICABLE_PLATFORM_PARADIGM = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#applicablePlatformParadigm" );
    
    public static final Property APPLICABLE_PLATFORM_TECHNOLOGY = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#applicablePlatformTechnology" );
    
    public static final Property CONSEQUENCE_IMPACT = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#consequenceImpact" );
    
    public static final Property CONSEQUENCE_NOTE = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#consequenceNote" );
    
    public static final Property CONSEQUENCE_SCOPE = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#consequenceScope" );
    
    public static final Property DESCRIPTION = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#description" );
    
    public static final Property DETECTION_DESCRIPTION = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#detectionDescription" );
    
    public static final Property DETECTION_EFFECTIVENESS = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#detectionEffectiveness" );
    
    public static final Property DETECTION_METHOD = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#detectionMethod" );
    
    public static final Property EXTENDED_DESCRIPTION = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#extendedDescription" );
    
    public static final Property HAS_APLICABLE_PLATFORM = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#hasAplicablePlatform" );
    
    public static final Property HAS_CAPEC = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#hasCAPEC" );
    
    public static final Property HAS_COMMON_CONSEQUENCE = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#hasCommonConsequence" );
    
    public static final Property HAS_DETECTION_METHOD = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#hasDetectionMethod" );
    
    public static final Property HAS_MODE_OF_INTRODUCTION = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#hasModeOfIntroduction" );
    
    public static final Property HAS_POTENTIAL_MITIGATION = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#hasPotentialMitigation" );
    
    public static final Property HAS_RELATED_WEAKNESS = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#hasRelatedWeakness" );
    
    public static final Property ID = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#id" );
    
    public static final Property LIKELIHOOD_OF_EXPLOIT = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#likelihoodOfExploit" );
    
    public static final Property MITIGATION_DESCRIPTION = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#mitigationDescription" );
    
    public static final Property MITIGATION_PHASE = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#mitigationPhase" );
    
    public static final Property MODE_OF_INTRODUCTION_NOTE = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#modeOfIntroductionNote" );
    
    public static final Property MODE_OF_INTRODUCTION_NOTE_PHASE = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#modeOfIntroductionNotePhase" );
    
    public static final Property NAME = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#name" );
    
    public static final Property RELATED_CWE = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#relatedCWE" );
    
    public static final Property RELATED_WEAKNESS_NATURE = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#relatedWeaknessNature" );
    
    public static final Property RELATED_WEAKNESS_ORDINAL = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#relatedWeaknessOrdinal" );
    
    public static final Property RELATED_WEAKNESS_VIEW_ID = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#relatedWeaknessViewId" );
    
    public static final Property STATUS = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#status" );
    
    public static final Property STRUCTURE = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#structure" );
    
    public static final Property WEAKNESS_ORDINALITY = m_model.createProperty( "http://w3id.org/sepses/vocab/ref/cwe#weaknessOrdinality" );
    
    public static final Resource APLICABLE_PLATFORM = m_model.createResource( "http://w3id.org/sepses/vocab/ref/cwe#AplicablePlatform" );
    
    public static final Resource CWE = m_model.createResource( "http://w3id.org/sepses/vocab/ref/cwe#CWE" );
    
    public static final Resource COMMON_CONSEQUENCE = m_model.createResource( "http://w3id.org/sepses/vocab/ref/cwe#CommonConsequence" );
    
    public static final Resource DETECTION_METHOD_CLASS = m_model.createResource( "http://w3id.org/sepses/vocab/ref/cwe#DetectionMethod" );
    
    public static final Resource MODE_OF_INTRODUCTION = m_model.createResource( "http://w3id.org/sepses/vocab/ref/cwe#ModeOfIntroduction" );
    
    public static final Resource POTENTIAL_MITIGATION = m_model.createResource( "http://w3id.org/sepses/vocab/ref/cwe#PotentialMitigation" );
    
    public static final Resource RELATED_WEAKNESS = m_model.createResource( "http://w3id.org/sepses/vocab/ref/cwe#RelatedWeakness" );
    
}
