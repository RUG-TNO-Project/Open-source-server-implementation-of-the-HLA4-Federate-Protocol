// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FederateAmbassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface CallbackResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.CallbackResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rti1516_2024.fedpro.CallbackSucceeded callbackSucceeded = 1;</code>
   * @return Whether the callbackSucceeded field is set.
   */
  boolean hasCallbackSucceeded();
  /**
   * <code>.rti1516_2024.fedpro.CallbackSucceeded callbackSucceeded = 1;</code>
   * @return The callbackSucceeded.
   */
  hla.rti1516_2024.fedpro.CallbackSucceeded getCallbackSucceeded();
  /**
   * <code>.rti1516_2024.fedpro.CallbackSucceeded callbackSucceeded = 1;</code>
   */
  hla.rti1516_2024.fedpro.CallbackSucceededOrBuilder getCallbackSucceededOrBuilder();

  /**
   * <code>.rti1516_2024.fedpro.ExceptionData callbackFailed = 2;</code>
   * @return Whether the callbackFailed field is set.
   */
  boolean hasCallbackFailed();
  /**
   * <code>.rti1516_2024.fedpro.ExceptionData callbackFailed = 2;</code>
   * @return The callbackFailed.
   */
  hla.rti1516_2024.fedpro.ExceptionData getCallbackFailed();
  /**
   * <code>.rti1516_2024.fedpro.ExceptionData callbackFailed = 2;</code>
   */
  hla.rti1516_2024.fedpro.ExceptionDataOrBuilder getCallbackFailedOrBuilder();

  hla.rti1516_2024.fedpro.CallbackResponse.CallbackResponseCase getCallbackResponseCase();
}
