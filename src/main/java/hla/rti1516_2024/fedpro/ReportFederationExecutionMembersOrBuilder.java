// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FederateAmbassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface ReportFederationExecutionMembersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.ReportFederationExecutionMembers)
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
   * <code>.rti1516_2024.fedpro.FederationExecutionMemberInformationSet report = 2;</code>
   * @return Whether the report field is set.
   */
  boolean hasReport();
  /**
   * <code>.rti1516_2024.fedpro.FederationExecutionMemberInformationSet report = 2;</code>
   * @return The report.
   */
  hla.rti1516_2024.fedpro.FederationExecutionMemberInformationSet getReport();
  /**
   * <code>.rti1516_2024.fedpro.FederationExecutionMemberInformationSet report = 2;</code>
   */
  hla.rti1516_2024.fedpro.FederationExecutionMemberInformationSetOrBuilder getReportOrBuilder();
}
