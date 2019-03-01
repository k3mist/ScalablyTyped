package typings
package atPulumiAwsLib.codebuildProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectArgs extends js.Object {
  /**
    * Information about the project's build output artifacts. Artifact blocks are documented below.
    */
  val artifacts: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EncryptionDisabledLocation]
  /**
    * Generates a publicly-accessible URL for the projects build badge. Available as `badge_url` attribute when enabled.
    */
  val badgeEnabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
    */
  val buildTimeout: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * Information about the cache storage for the project. Cache blocks are documented below.
    */
  val cache: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_LocationType]] = js.undefined
  /**
    * A short description of the project.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
    */
  val encryptionKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Information about the project's build environment. Environment blocks are documented below.
    */
  val environment: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CertificateComputeType]
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A set of secondary artifacts to be used inside the build. Secondary artifacts blocks are documented below.
    */
  val secondaryArtifacts: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ArtifactIdentifierEncryptionDisabled]
      ]
    ]
  ] = js.undefined
  /**
    * A set of secondary sources to be used inside the build. Secondary sources blocks are documented below.
    */
  val secondarySources: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AuthsBuildspecGitCloneDepth]
      ]
    ]
  ] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  val serviceRole: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Information about the project's input source code. Source blocks are documented below.
    */
  val source: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AuthsBuildspecGitCloneDepthInsecureSsl]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * Configuration for the builds to run inside a VPC. VPC config blocks are documented below.
    */
  val vpcConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnets]] = js.undefined
}

object ProjectArgs {
  @scala.inline
  def apply(
    artifacts: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EncryptionDisabledLocation],
    environment: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CertificateComputeType],
    serviceRole: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    source: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AuthsBuildspecGitCloneDepthInsecureSsl],
    badgeEnabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    buildTimeout: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    cache: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_LocationType] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    encryptionKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    secondaryArtifacts: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ArtifactIdentifierEncryptionDisabled]
      ]
    ] = null,
    secondarySources: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AuthsBuildspecGitCloneDepth]
      ]
    ] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    vpcConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnets] = null
  ): ProjectArgs = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (badgeEnabled != null) __obj.updateDynamic("badgeEnabled")(badgeEnabled.asInstanceOf[js.Any])
    if (buildTimeout != null) __obj.updateDynamic("buildTimeout")(buildTimeout.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (secondaryArtifacts != null) __obj.updateDynamic("secondaryArtifacts")(secondaryArtifacts.asInstanceOf[js.Any])
    if (secondarySources != null) __obj.updateDynamic("secondarySources")(secondarySources.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectArgs]
  }
}

