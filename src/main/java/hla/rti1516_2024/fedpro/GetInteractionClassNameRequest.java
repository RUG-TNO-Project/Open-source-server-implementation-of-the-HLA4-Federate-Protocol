// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * Protobuf type {@code rti1516_2024.fedpro.GetInteractionClassNameRequest}
 */
public final class GetInteractionClassNameRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.GetInteractionClassNameRequest)
    GetInteractionClassNameRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      GetInteractionClassNameRequest.class.getName());
  }
  // Use GetInteractionClassNameRequest.newBuilder() to construct.
  private GetInteractionClassNameRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetInteractionClassNameRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetInteractionClassNameRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetInteractionClassNameRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.GetInteractionClassNameRequest.class, hla.rti1516_2024.fedpro.GetInteractionClassNameRequest.Builder.class);
  }

  private int bitField0_;
  public static final int INTERACTIONCLASS_FIELD_NUMBER = 1;
  private hla.rti1516_2024.fedpro.InteractionClassHandle interactionClass_;
  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return Whether the interactionClass field is set.
   */
  @java.lang.Override
  public boolean hasInteractionClass() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return The interactionClass.
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.InteractionClassHandle getInteractionClass() {
    return interactionClass_ == null ? hla.rti1516_2024.fedpro.InteractionClassHandle.getDefaultInstance() : interactionClass_;
  }
  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder getInteractionClassOrBuilder() {
    return interactionClass_ == null ? hla.rti1516_2024.fedpro.InteractionClassHandle.getDefaultInstance() : interactionClass_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getInteractionClass());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInteractionClass());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof hla.rti1516_2024.fedpro.GetInteractionClassNameRequest)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.GetInteractionClassNameRequest other = (hla.rti1516_2024.fedpro.GetInteractionClassNameRequest) obj;

    if (hasInteractionClass() != other.hasInteractionClass()) return false;
    if (hasInteractionClass()) {
      if (!getInteractionClass()
          .equals(other.getInteractionClass())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasInteractionClass()) {
      hash = (37 * hash) + INTERACTIONCLASS_FIELD_NUMBER;
      hash = (53 * hash) + getInteractionClass().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(hla.rti1516_2024.fedpro.GetInteractionClassNameRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rti1516_2024.fedpro.GetInteractionClassNameRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.GetInteractionClassNameRequest)
      hla.rti1516_2024.fedpro.GetInteractionClassNameRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetInteractionClassNameRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetInteractionClassNameRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.GetInteractionClassNameRequest.class, hla.rti1516_2024.fedpro.GetInteractionClassNameRequest.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.GetInteractionClassNameRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        internalGetInteractionClassFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      interactionClass_ = null;
      if (interactionClassBuilder_ != null) {
        interactionClassBuilder_.dispose();
        interactionClassBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.RTIambassador.internal_static_rti1516_2024_fedpro_GetInteractionClassNameRequest_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetInteractionClassNameRequest getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.GetInteractionClassNameRequest.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetInteractionClassNameRequest build() {
      hla.rti1516_2024.fedpro.GetInteractionClassNameRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.GetInteractionClassNameRequest buildPartial() {
      hla.rti1516_2024.fedpro.GetInteractionClassNameRequest result = new hla.rti1516_2024.fedpro.GetInteractionClassNameRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.GetInteractionClassNameRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.interactionClass_ = interactionClassBuilder_ == null
            ? interactionClass_
            : interactionClassBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.GetInteractionClassNameRequest) {
        return mergeFrom((hla.rti1516_2024.fedpro.GetInteractionClassNameRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.GetInteractionClassNameRequest other) {
      if (other == hla.rti1516_2024.fedpro.GetInteractionClassNameRequest.getDefaultInstance()) return this;
      if (other.hasInteractionClass()) {
        mergeInteractionClass(other.getInteractionClass());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  internalGetInteractionClassFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private hla.rti1516_2024.fedpro.InteractionClassHandle interactionClass_;
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.InteractionClassHandle, hla.rti1516_2024.fedpro.InteractionClassHandle.Builder, hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder> interactionClassBuilder_;
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     * @return Whether the interactionClass field is set.
     */
    public boolean hasInteractionClass() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     * @return The interactionClass.
     */
    public hla.rti1516_2024.fedpro.InteractionClassHandle getInteractionClass() {
      if (interactionClassBuilder_ == null) {
        return interactionClass_ == null ? hla.rti1516_2024.fedpro.InteractionClassHandle.getDefaultInstance() : interactionClass_;
      } else {
        return interactionClassBuilder_.getMessage();
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder setInteractionClass(hla.rti1516_2024.fedpro.InteractionClassHandle value) {
      if (interactionClassBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        interactionClass_ = value;
      } else {
        interactionClassBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder setInteractionClass(
        hla.rti1516_2024.fedpro.InteractionClassHandle.Builder builderForValue) {
      if (interactionClassBuilder_ == null) {
        interactionClass_ = builderForValue.build();
      } else {
        interactionClassBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder mergeInteractionClass(hla.rti1516_2024.fedpro.InteractionClassHandle value) {
      if (interactionClassBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          interactionClass_ != null &&
          interactionClass_ != hla.rti1516_2024.fedpro.InteractionClassHandle.getDefaultInstance()) {
          getInteractionClassBuilder().mergeFrom(value);
        } else {
          interactionClass_ = value;
        }
      } else {
        interactionClassBuilder_.mergeFrom(value);
      }
      if (interactionClass_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public Builder clearInteractionClass() {
      bitField0_ = (bitField0_ & ~0x00000001);
      interactionClass_ = null;
      if (interactionClassBuilder_ != null) {
        interactionClassBuilder_.dispose();
        interactionClassBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public hla.rti1516_2024.fedpro.InteractionClassHandle.Builder getInteractionClassBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return internalGetInteractionClassFieldBuilder().getBuilder();
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    public hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder getInteractionClassOrBuilder() {
      if (interactionClassBuilder_ != null) {
        return interactionClassBuilder_.getMessageOrBuilder();
      } else {
        return interactionClass_ == null ?
            hla.rti1516_2024.fedpro.InteractionClassHandle.getDefaultInstance() : interactionClass_;
      }
    }
    /**
     * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        hla.rti1516_2024.fedpro.InteractionClassHandle, hla.rti1516_2024.fedpro.InteractionClassHandle.Builder, hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder> 
        internalGetInteractionClassFieldBuilder() {
      if (interactionClassBuilder_ == null) {
        interactionClassBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            hla.rti1516_2024.fedpro.InteractionClassHandle, hla.rti1516_2024.fedpro.InteractionClassHandle.Builder, hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder>(
                getInteractionClass(),
                getParentForChildren(),
                isClean());
        interactionClass_ = null;
      }
      return interactionClassBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.GetInteractionClassNameRequest)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.GetInteractionClassNameRequest)
  private static final hla.rti1516_2024.fedpro.GetInteractionClassNameRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.GetInteractionClassNameRequest();
  }

  public static hla.rti1516_2024.fedpro.GetInteractionClassNameRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetInteractionClassNameRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetInteractionClassNameRequest>() {
    @java.lang.Override
    public GetInteractionClassNameRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GetInteractionClassNameRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetInteractionClassNameRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.GetInteractionClassNameRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

