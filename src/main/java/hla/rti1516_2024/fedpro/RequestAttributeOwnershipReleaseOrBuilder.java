// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FederateAmbassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface RequestAttributeOwnershipReleaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.RequestAttributeOwnershipRelease)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   * @return Whether the objectInstance field is set.
   */
  boolean hasObjectInstance();
  /**
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   * @return The objectInstance.
   */
  hla.rti1516_2024.fedpro.ObjectInstanceHandle getObjectInstance();
  /**
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   */
  hla.rti1516_2024.fedpro.ObjectInstanceHandleOrBuilder getObjectInstanceOrBuilder();

  /**
   * <code>.rti1516_2024.fedpro.AttributeHandleSet candidateAttributes = 2;</code>
   * @return Whether the candidateAttributes field is set.
   */
  boolean hasCandidateAttributes();
  /**
   * <code>.rti1516_2024.fedpro.AttributeHandleSet candidateAttributes = 2;</code>
   * @return The candidateAttributes.
   */
  hla.rti1516_2024.fedpro.AttributeHandleSet getCandidateAttributes();
  /**
   * <code>.rti1516_2024.fedpro.AttributeHandleSet candidateAttributes = 2;</code>
   */
  hla.rti1516_2024.fedpro.AttributeHandleSetOrBuilder getCandidateAttributesOrBuilder();

  /**
   * <code>bytes userSuppliedTag = 3;</code>
   * @return The userSuppliedTag.
   */
  com.google.protobuf.ByteString getUserSuppliedTag();
}
