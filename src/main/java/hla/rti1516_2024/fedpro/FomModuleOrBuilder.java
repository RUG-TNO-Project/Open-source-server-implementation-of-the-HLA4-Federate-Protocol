// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: datatypes.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface FomModuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.FomModule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rti1516_2024.fedpro.FileFomModule file = 1;</code>
   * @return Whether the file field is set.
   */
  boolean hasFile();
  /**
   * <code>.rti1516_2024.fedpro.FileFomModule file = 1;</code>
   * @return The file.
   */
  hla.rti1516_2024.fedpro.FileFomModule getFile();
  /**
   * <code>.rti1516_2024.fedpro.FileFomModule file = 1;</code>
   */
  hla.rti1516_2024.fedpro.FileFomModuleOrBuilder getFileOrBuilder();

  /**
   * <pre>
   * FOM module compressed as a Zip file (ISO/IEC 21320-1)
   * </pre>
   *
   * <code>bytes compressedModule = 2;</code>
   * @return Whether the compressedModule field is set.
   */
  boolean hasCompressedModule();
  /**
   * <pre>
   * FOM module compressed as a Zip file (ISO/IEC 21320-1)
   * </pre>
   *
   * <code>bytes compressedModule = 2;</code>
   * @return The compressedModule.
   */
  com.google.protobuf.ByteString getCompressedModule();

  /**
   * <pre>
   * URL for the FOM module
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * URL for the FOM module
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * URL for the FOM module
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  hla.rti1516_2024.fedpro.FomModule.FomModuleCase getFomModuleCase();
}
