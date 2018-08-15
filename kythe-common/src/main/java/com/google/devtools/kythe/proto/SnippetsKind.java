// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/xref.proto

package com.google.devtools.kythe.proto;

/**
 * <pre>
 * Which types of snippets to return from a given CrossReferences or Decorations
 * RPC.
 * TODO(schroederc): extend snippet kinds to be (none, indexer-default, or
 * always line-based) instead of (none, all).
 * </pre>
 *
 * Protobuf enum {@code kythe.proto.SnippetsKind}
 */
public enum SnippetsKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Return no snippets.
   * </pre>
   *
   * <code>NONE = 0;</code>
   */
  NONE(0),
  /**
   * <pre>
   * Return the default snippet for each item that has one.
   * </pre>
   *
   * <code>DEFAULT = 1;</code>
   */
  DEFAULT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Return no snippets.
   * </pre>
   *
   * <code>NONE = 0;</code>
   */
  public static final int NONE_VALUE = 0;
  /**
   * <pre>
   * Return the default snippet for each item that has one.
   * </pre>
   *
   * <code>DEFAULT = 1;</code>
   */
  public static final int DEFAULT_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SnippetsKind valueOf(int value) {
    return forNumber(value);
  }

  public static SnippetsKind forNumber(int value) {
    switch (value) {
      case 0: return NONE;
      case 1: return DEFAULT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SnippetsKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SnippetsKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SnippetsKind>() {
          public SnippetsKind findValueByNumber(int number) {
            return SnippetsKind.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.devtools.kythe.proto.Xref.getDescriptor().getEnumTypes().get(0);
  }

  private static final SnippetsKind[] VALUES = values();

  public static SnippetsKind valueOf(
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

  private SnippetsKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:kythe.proto.SnippetsKind)
}

