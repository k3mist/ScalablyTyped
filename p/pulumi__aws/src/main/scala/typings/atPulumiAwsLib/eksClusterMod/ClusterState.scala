package typings
package atPulumiAwsLib.eksClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Nested attribute containing `certificate-authority-data` for your cluster.
    */
  val certificateAuthority: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DataInputString]] = js.undefined
  val createdAt: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The endpoint for your Kubernetes API server.
    */
  val endpoint: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the cluster.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The platform version for the cluster.
    */
  val platformVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Desired Kubernetes master version. If you do not specify a value, the latest available version is used.
    */
  val version: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Nested argument for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Configuration detailed below.
    */
  val vpcConfig: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIdsVpcId]
  ] = js.undefined
}

object ClusterState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    certificateAuthority: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DataInputString] = null,
    createdAt: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    endpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    platformVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    version: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    vpcConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIdsVpcId] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificateAuthority != null) __obj.updateDynamic("certificateAuthority")(certificateAuthority.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

