// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FederateAmbassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface FederationSynchronizedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.FederationSynchronized)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string synchronizationPointLabel = 1;</code>
   * @return The synchronizationPointLabel.
   */
  java.lang.String getSynchronizationPointLabel();
  /**
   * <code>string synchronizationPointLabel = 1;</code>
   * @return The bytes for synchronizationPointLabel.
   */
  com.google.protobuf.ByteString
      getSynchronizationPointLabelBytes();

  /**
   * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   * @return Whether the failedToSyncSet field is set.
   */
  boolean hasFailedToSyncSet();
  /**
   * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   * @return The failedToSyncSet.
   */
  hla.rti1516_2024.fedpro.FederateHandleSet getFailedToSyncSet();
  /**
   * <code>.rti1516_2024.fedpro.FederateHandleSet failedToSyncSet = 2;</code>
   */
  hla.rti1516_2024.fedpro.FederateHandleSetOrBuilder getFailedToSyncSetOrBuilder();
}
