// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface RequestFederationSaveWithTimeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.RequestFederationSaveWithTimeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string label = 1;</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <code>string label = 1;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 2;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 2;</code>
   * @return The time.
   */
  hla.rti1516_2024.fedpro.LogicalTime getTime();
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 2;</code>
   */
  hla.rti1516_2024.fedpro.LogicalTimeOrBuilder getTimeOrBuilder();
}
