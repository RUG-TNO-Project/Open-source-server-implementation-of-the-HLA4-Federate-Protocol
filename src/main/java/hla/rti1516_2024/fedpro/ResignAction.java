// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: datatypes.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf enum {@code rti1516_2024.fedpro.ResignAction}
 */
public enum ResignAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNCONDITIONALLY_DIVEST_ATTRIBUTES = 0;</code>
   */
  UNCONDITIONALLY_DIVEST_ATTRIBUTES(0),
  /**
   * <code>DELETE_OBJECTS = 1;</code>
   */
  DELETE_OBJECTS(1),
  /**
   * <code>CANCEL_PENDING_OWNERSHIP_ACQUISITIONS = 2;</code>
   */
  CANCEL_PENDING_OWNERSHIP_ACQUISITIONS(2),
  /**
   * <code>DELETE_OBJECTS_THEN_DIVEST = 3;</code>
   */
  DELETE_OBJECTS_THEN_DIVEST(3),
  /**
   * <code>CANCEL_THEN_DELETE_THEN_DIVEST = 4;</code>
   */
  CANCEL_THEN_DELETE_THEN_DIVEST(4),
  /**
   * <code>NO_ACTION = 5;</code>
   */
  NO_ACTION(5),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      ResignAction.class.getName());
  }
  /**
   * <code>UNCONDITIONALLY_DIVEST_ATTRIBUTES = 0;</code>
   */
  public static final int UNCONDITIONALLY_DIVEST_ATTRIBUTES_VALUE = 0;
  /**
   * <code>DELETE_OBJECTS = 1;</code>
   */
  public static final int DELETE_OBJECTS_VALUE = 1;
  /**
   * <code>CANCEL_PENDING_OWNERSHIP_ACQUISITIONS = 2;</code>
   */
  public static final int CANCEL_PENDING_OWNERSHIP_ACQUISITIONS_VALUE = 2;
  /**
   * <code>DELETE_OBJECTS_THEN_DIVEST = 3;</code>
   */
  public static final int DELETE_OBJECTS_THEN_DIVEST_VALUE = 3;
  /**
   * <code>CANCEL_THEN_DELETE_THEN_DIVEST = 4;</code>
   */
  public static final int CANCEL_THEN_DELETE_THEN_DIVEST_VALUE = 4;
  /**
   * <code>NO_ACTION = 5;</code>
   */
  public static final int NO_ACTION_VALUE = 5;


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
  public static ResignAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResignAction forNumber(int value) {
    switch (value) {
      case 0: return UNCONDITIONALLY_DIVEST_ATTRIBUTES;
      case 1: return DELETE_OBJECTS;
      case 2: return CANCEL_PENDING_OWNERSHIP_ACQUISITIONS;
      case 3: return DELETE_OBJECTS_THEN_DIVEST;
      case 4: return CANCEL_THEN_DELETE_THEN_DIVEST;
      case 5: return NO_ACTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResignAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResignAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResignAction>() {
          public ResignAction findValueByNumber(int number) {
            return ResignAction.forNumber(number);
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
    return hla.rti1516_2024.fedpro.Datatypes.getDescriptor().getEnumTypes().get(2);
  }

  private static final ResignAction[] VALUES = values();

  public static ResignAction valueOf(
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

  private ResignAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:rti1516_2024.fedpro.ResignAction)
}

