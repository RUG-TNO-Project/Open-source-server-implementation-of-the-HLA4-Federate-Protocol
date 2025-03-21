// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: datatypes.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

/**
 * <pre>
 * Set of FederateHandle elements.
 * The set shall not contain duplicate elements.
 * </pre>
 *
 * Protobuf type {@code rti1516_2024.fedpro.FederateHandleSet}
 */
public final class FederateHandleSet extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:rti1516_2024.fedpro.FederateHandleSet)
    FederateHandleSetOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 30,
      /* patch= */ 1,
      /* suffix= */ "",
      FederateHandleSet.class.getName());
  }
  // Use FederateHandleSet.newBuilder() to construct.
  private FederateHandleSet(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FederateHandleSet() {
    federateHandle_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_FederateHandleSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_FederateHandleSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hla.rti1516_2024.fedpro.FederateHandleSet.class, hla.rti1516_2024.fedpro.FederateHandleSet.Builder.class);
  }

  public static final int FEDERATEHANDLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<hla.rti1516_2024.fedpro.FederateHandle> federateHandle_;
  /**
   * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
   */
  @java.lang.Override
  public java.util.List<hla.rti1516_2024.fedpro.FederateHandle> getFederateHandleList() {
    return federateHandle_;
  }
  /**
   * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends hla.rti1516_2024.fedpro.FederateHandleOrBuilder> 
      getFederateHandleOrBuilderList() {
    return federateHandle_;
  }
  /**
   * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
   */
  @java.lang.Override
  public int getFederateHandleCount() {
    return federateHandle_.size();
  }
  /**
   * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.FederateHandle getFederateHandle(int index) {
    return federateHandle_.get(index);
  }
  /**
   * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
   */
  @java.lang.Override
  public hla.rti1516_2024.fedpro.FederateHandleOrBuilder getFederateHandleOrBuilder(
      int index) {
    return federateHandle_.get(index);
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
    for (int i = 0; i < federateHandle_.size(); i++) {
      output.writeMessage(1, federateHandle_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < federateHandle_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, federateHandle_.get(i));
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
    if (!(obj instanceof hla.rti1516_2024.fedpro.FederateHandleSet)) {
      return super.equals(obj);
    }
    hla.rti1516_2024.fedpro.FederateHandleSet other = (hla.rti1516_2024.fedpro.FederateHandleSet) obj;

    if (!getFederateHandleList()
        .equals(other.getFederateHandleList())) return false;
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
    if (getFederateHandleCount() > 0) {
      hash = (37 * hash) + FEDERATEHANDLE_FIELD_NUMBER;
      hash = (53 * hash) + getFederateHandleList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hla.rti1516_2024.fedpro.FederateHandleSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.FederateHandleSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.FederateHandleSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.FederateHandleSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.FederateHandleSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hla.rti1516_2024.fedpro.FederateHandleSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.FederateHandleSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.FederateHandleSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static hla.rti1516_2024.fedpro.FederateHandleSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static hla.rti1516_2024.fedpro.FederateHandleSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hla.rti1516_2024.fedpro.FederateHandleSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static hla.rti1516_2024.fedpro.FederateHandleSet parseFrom(
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
  public static Builder newBuilder(hla.rti1516_2024.fedpro.FederateHandleSet prototype) {
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
   * <pre>
   * Set of FederateHandle elements.
   * The set shall not contain duplicate elements.
   * </pre>
   *
   * Protobuf type {@code rti1516_2024.fedpro.FederateHandleSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rti1516_2024.fedpro.FederateHandleSet)
      hla.rti1516_2024.fedpro.FederateHandleSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_FederateHandleSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_FederateHandleSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hla.rti1516_2024.fedpro.FederateHandleSet.class, hla.rti1516_2024.fedpro.FederateHandleSet.Builder.class);
    }

    // Construct using hla.rti1516_2024.fedpro.FederateHandleSet.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (federateHandleBuilder_ == null) {
        federateHandle_ = java.util.Collections.emptyList();
      } else {
        federateHandle_ = null;
        federateHandleBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hla.rti1516_2024.fedpro.Datatypes.internal_static_rti1516_2024_fedpro_FederateHandleSet_descriptor;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.FederateHandleSet getDefaultInstanceForType() {
      return hla.rti1516_2024.fedpro.FederateHandleSet.getDefaultInstance();
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.FederateHandleSet build() {
      hla.rti1516_2024.fedpro.FederateHandleSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hla.rti1516_2024.fedpro.FederateHandleSet buildPartial() {
      hla.rti1516_2024.fedpro.FederateHandleSet result = new hla.rti1516_2024.fedpro.FederateHandleSet(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(hla.rti1516_2024.fedpro.FederateHandleSet result) {
      if (federateHandleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          federateHandle_ = java.util.Collections.unmodifiableList(federateHandle_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.federateHandle_ = federateHandle_;
      } else {
        result.federateHandle_ = federateHandleBuilder_.build();
      }
    }

    private void buildPartial0(hla.rti1516_2024.fedpro.FederateHandleSet result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hla.rti1516_2024.fedpro.FederateHandleSet) {
        return mergeFrom((hla.rti1516_2024.fedpro.FederateHandleSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hla.rti1516_2024.fedpro.FederateHandleSet other) {
      if (other == hla.rti1516_2024.fedpro.FederateHandleSet.getDefaultInstance()) return this;
      if (federateHandleBuilder_ == null) {
        if (!other.federateHandle_.isEmpty()) {
          if (federateHandle_.isEmpty()) {
            federateHandle_ = other.federateHandle_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFederateHandleIsMutable();
            federateHandle_.addAll(other.federateHandle_);
          }
          onChanged();
        }
      } else {
        if (!other.federateHandle_.isEmpty()) {
          if (federateHandleBuilder_.isEmpty()) {
            federateHandleBuilder_.dispose();
            federateHandleBuilder_ = null;
            federateHandle_ = other.federateHandle_;
            bitField0_ = (bitField0_ & ~0x00000001);
            federateHandleBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 internalGetFederateHandleFieldBuilder() : null;
          } else {
            federateHandleBuilder_.addAllMessages(other.federateHandle_);
          }
        }
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
              hla.rti1516_2024.fedpro.FederateHandle m =
                  input.readMessage(
                      hla.rti1516_2024.fedpro.FederateHandle.parser(),
                      extensionRegistry);
              if (federateHandleBuilder_ == null) {
                ensureFederateHandleIsMutable();
                federateHandle_.add(m);
              } else {
                federateHandleBuilder_.addMessage(m);
              }
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

    private java.util.List<hla.rti1516_2024.fedpro.FederateHandle> federateHandle_ =
      java.util.Collections.emptyList();
    private void ensureFederateHandleIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        federateHandle_ = new java.util.ArrayList<hla.rti1516_2024.fedpro.FederateHandle>(federateHandle_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        hla.rti1516_2024.fedpro.FederateHandle, hla.rti1516_2024.fedpro.FederateHandle.Builder, hla.rti1516_2024.fedpro.FederateHandleOrBuilder> federateHandleBuilder_;

    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public java.util.List<hla.rti1516_2024.fedpro.FederateHandle> getFederateHandleList() {
      if (federateHandleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(federateHandle_);
      } else {
        return federateHandleBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public int getFederateHandleCount() {
      if (federateHandleBuilder_ == null) {
        return federateHandle_.size();
      } else {
        return federateHandleBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public hla.rti1516_2024.fedpro.FederateHandle getFederateHandle(int index) {
      if (federateHandleBuilder_ == null) {
        return federateHandle_.get(index);
      } else {
        return federateHandleBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder setFederateHandle(
        int index, hla.rti1516_2024.fedpro.FederateHandle value) {
      if (federateHandleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFederateHandleIsMutable();
        federateHandle_.set(index, value);
        onChanged();
      } else {
        federateHandleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder setFederateHandle(
        int index, hla.rti1516_2024.fedpro.FederateHandle.Builder builderForValue) {
      if (federateHandleBuilder_ == null) {
        ensureFederateHandleIsMutable();
        federateHandle_.set(index, builderForValue.build());
        onChanged();
      } else {
        federateHandleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder addFederateHandle(hla.rti1516_2024.fedpro.FederateHandle value) {
      if (federateHandleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFederateHandleIsMutable();
        federateHandle_.add(value);
        onChanged();
      } else {
        federateHandleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder addFederateHandle(
        int index, hla.rti1516_2024.fedpro.FederateHandle value) {
      if (federateHandleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFederateHandleIsMutable();
        federateHandle_.add(index, value);
        onChanged();
      } else {
        federateHandleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder addFederateHandle(
        hla.rti1516_2024.fedpro.FederateHandle.Builder builderForValue) {
      if (federateHandleBuilder_ == null) {
        ensureFederateHandleIsMutable();
        federateHandle_.add(builderForValue.build());
        onChanged();
      } else {
        federateHandleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder addFederateHandle(
        int index, hla.rti1516_2024.fedpro.FederateHandle.Builder builderForValue) {
      if (federateHandleBuilder_ == null) {
        ensureFederateHandleIsMutable();
        federateHandle_.add(index, builderForValue.build());
        onChanged();
      } else {
        federateHandleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder addAllFederateHandle(
        java.lang.Iterable<? extends hla.rti1516_2024.fedpro.FederateHandle> values) {
      if (federateHandleBuilder_ == null) {
        ensureFederateHandleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, federateHandle_);
        onChanged();
      } else {
        federateHandleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder clearFederateHandle() {
      if (federateHandleBuilder_ == null) {
        federateHandle_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        federateHandleBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public Builder removeFederateHandle(int index) {
      if (federateHandleBuilder_ == null) {
        ensureFederateHandleIsMutable();
        federateHandle_.remove(index);
        onChanged();
      } else {
        federateHandleBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public hla.rti1516_2024.fedpro.FederateHandle.Builder getFederateHandleBuilder(
        int index) {
      return internalGetFederateHandleFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public hla.rti1516_2024.fedpro.FederateHandleOrBuilder getFederateHandleOrBuilder(
        int index) {
      if (federateHandleBuilder_ == null) {
        return federateHandle_.get(index);  } else {
        return federateHandleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public java.util.List<? extends hla.rti1516_2024.fedpro.FederateHandleOrBuilder> 
         getFederateHandleOrBuilderList() {
      if (federateHandleBuilder_ != null) {
        return federateHandleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(federateHandle_);
      }
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public hla.rti1516_2024.fedpro.FederateHandle.Builder addFederateHandleBuilder() {
      return internalGetFederateHandleFieldBuilder().addBuilder(
          hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance());
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public hla.rti1516_2024.fedpro.FederateHandle.Builder addFederateHandleBuilder(
        int index) {
      return internalGetFederateHandleFieldBuilder().addBuilder(
          index, hla.rti1516_2024.fedpro.FederateHandle.getDefaultInstance());
    }
    /**
     * <code>repeated .rti1516_2024.fedpro.FederateHandle federateHandle = 1;</code>
     */
    public java.util.List<hla.rti1516_2024.fedpro.FederateHandle.Builder> 
         getFederateHandleBuilderList() {
      return internalGetFederateHandleFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        hla.rti1516_2024.fedpro.FederateHandle, hla.rti1516_2024.fedpro.FederateHandle.Builder, hla.rti1516_2024.fedpro.FederateHandleOrBuilder> 
        internalGetFederateHandleFieldBuilder() {
      if (federateHandleBuilder_ == null) {
        federateHandleBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            hla.rti1516_2024.fedpro.FederateHandle, hla.rti1516_2024.fedpro.FederateHandle.Builder, hla.rti1516_2024.fedpro.FederateHandleOrBuilder>(
                federateHandle_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        federateHandle_ = null;
      }
      return federateHandleBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:rti1516_2024.fedpro.FederateHandleSet)
  }

  // @@protoc_insertion_point(class_scope:rti1516_2024.fedpro.FederateHandleSet)
  private static final hla.rti1516_2024.fedpro.FederateHandleSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hla.rti1516_2024.fedpro.FederateHandleSet();
  }

  public static hla.rti1516_2024.fedpro.FederateHandleSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FederateHandleSet>
      PARSER = new com.google.protobuf.AbstractParser<FederateHandleSet>() {
    @java.lang.Override
    public FederateHandleSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<FederateHandleSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FederateHandleSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hla.rti1516_2024.fedpro.FederateHandleSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

