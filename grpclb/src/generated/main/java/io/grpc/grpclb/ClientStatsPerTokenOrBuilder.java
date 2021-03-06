// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: load_balancer.proto

package io.grpc.grpclb;

public interface ClientStatsPerTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.lb.v1.ClientStatsPerToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * See Server.load_balance_token.
   * </pre>
   *
   * <code>string load_balance_token = 1;</code>
   */
  java.lang.String getLoadBalanceToken();
  /**
   * <pre>
   * See Server.load_balance_token.
   * </pre>
   *
   * <code>string load_balance_token = 1;</code>
   */
  com.google.protobuf.ByteString
      getLoadBalanceTokenBytes();

  /**
   * <pre>
   * The total number of RPCs that finished associated with the token.
   * </pre>
   *
   * <code>int64 num_calls = 2;</code>
   */
  long getNumCalls();
}
