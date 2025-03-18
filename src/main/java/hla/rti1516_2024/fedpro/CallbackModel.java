// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: datatypes.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf enum {@code rti1516_2024.fedpro.CallbackModel}
 */
public enum CallbackModel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EVOKED = 0;</code>
   */
  EVOKED(0),
  /**
   * <code>IMMEDIATE = 1;</code>
   */
  IMMEDIATE(1),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      CallbackModel.class.getName());
  }
  /**
   * <code>EVOKED = 0;</code>
   */
  public static final int EVOKED_VALUE = 0;
  /**
   * <code>IMMEDIATE = 1;</code>
   */
  public static final int IMMEDIATE_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CallbackModel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CallbackModel forNumber(int value) {
    switch (value) {
      case 0: return EVOKED;
      case 1: return IMMEDIATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CallbackModel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CallbackModel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CallbackModel>() {
          public CallbackModel findValueByNumber(int number) {
            return CallbackModel.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.Datatypes.getDescriptor().getEnumTypes().get(1);
  }

  private static final CallbackModel[] VALUES = values();

  public static CallbackModel valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CallbackModel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:rti1516_2024.fedpro.CallbackModel)
}

