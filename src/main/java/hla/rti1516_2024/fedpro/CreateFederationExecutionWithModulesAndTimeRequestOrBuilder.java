// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface CreateFederationExecutionWithModulesAndTimeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.CreateFederationExecutionWithModulesAndTimeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string federationName = 1;</code>
   * @return The federationName.
   */
  java.lang.String getFederationName();
  /**
   * <code>string federationName = 1;</code>
   * @return The bytes for federationName.
   */
  com.google.protobuf.ByteString
      getFederationNameBytes();

  /**
   * <code>.rti1516_2024.fedpro.FomModuleSet fomModules = 2;</code>
   * @return Whether the fomModules field is set.
   */
  boolean hasFomModules();
  /**
   * <code>.rti1516_2024.fedpro.FomModuleSet fomModules = 2;</code>
   * @return The fomModules.
   */
  hla.rti1516_2024.fedpro.FomModuleSet getFomModules();
  /**
   * <code>.rti1516_2024.fedpro.FomModuleSet fomModules = 2;</code>
   */
  hla.rti1516_2024.fedpro.FomModuleSetOrBuilder getFomModulesOrBuilder();

  /**
   * <code>string logicalTimeImplementationName = 3;</code>
   * @return The logicalTimeImplementationName.
   */
  java.lang.String getLogicalTimeImplementationName();
  /**
   * <code>string logicalTimeImplementationName = 3;</code>
   * @return The bytes for logicalTimeImplementationName.
   */
  com.google.protobuf.ByteString
      getLogicalTimeImplementationNameBytes();
}
