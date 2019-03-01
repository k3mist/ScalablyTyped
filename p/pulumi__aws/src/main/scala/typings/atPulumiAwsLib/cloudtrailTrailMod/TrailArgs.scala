package typings
package atPulumiAwsLib.cloudtrailTrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrailArgs extends js.Object {
  /**
    * Specifies a log group name using an Amazon Resource Name (ARN),
    * that represents the log group to which CloudTrail logs will be delivered.
    */
  val cloudWatchLogsGroupArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the role for the CloudWatch Logs
    * endpoint to assume to write to a user’s log group.
    */
  val cloudWatchLogsRoleArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether log file integrity validation is enabled.
    * Defaults to `false`.
    */
  val enableLogFileValidation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Enables logging for the trail. Defaults to `true`.
    * Setting this to `false` will pause logging.
    */
  val enableLogging: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these.
    */
  val eventSelectors: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DataResourcesIncludeManagementEvents]
      ]
    ]
  ] = js.undefined
  /**
    * Specifies whether the trail is publishing events
    * from global services such as IAM to the log files. Defaults to `true`.
    */
  val includeGlobalServiceEvents: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether the trail is created in the current
    * region or in all regions. Defaults to `false`.
    */
  val isMultiRegionTrail: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
    */
  val isOrganizationTrail: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies the KMS key ARN to use to encrypt the logs delivered by CloudTrail.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the name of the trail.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the name of the S3 bucket designated for publishing log files.
    */
  val s3BucketName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Specifies the S3 key prefix that precedes
    * the name of the bucket you have designated for log file delivery.
    */
  val s3KeyPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the name of the Amazon SNS topic
    * defined for notification of log file delivery.
    */
  val snsTopicName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the trail
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

object TrailArgs {
  @scala.inline
  def apply(
    s3BucketName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    cloudWatchLogsGroupArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    cloudWatchLogsRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    enableLogFileValidation: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    enableLogging: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    eventSelectors: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DataResourcesIncludeManagementEvents]
      ]
    ] = null,
    includeGlobalServiceEvents: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    isMultiRegionTrail: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    isOrganizationTrail: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    kmsKeyId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    s3KeyPrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    snsTopicName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): TrailArgs = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
    if (cloudWatchLogsGroupArn != null) __obj.updateDynamic("cloudWatchLogsGroupArn")(cloudWatchLogsGroupArn.asInstanceOf[js.Any])
    if (cloudWatchLogsRoleArn != null) __obj.updateDynamic("cloudWatchLogsRoleArn")(cloudWatchLogsRoleArn.asInstanceOf[js.Any])
    if (enableLogFileValidation != null) __obj.updateDynamic("enableLogFileValidation")(enableLogFileValidation.asInstanceOf[js.Any])
    if (enableLogging != null) __obj.updateDynamic("enableLogging")(enableLogging.asInstanceOf[js.Any])
    if (eventSelectors != null) __obj.updateDynamic("eventSelectors")(eventSelectors.asInstanceOf[js.Any])
    if (includeGlobalServiceEvents != null) __obj.updateDynamic("includeGlobalServiceEvents")(includeGlobalServiceEvents.asInstanceOf[js.Any])
    if (isMultiRegionTrail != null) __obj.updateDynamic("isMultiRegionTrail")(isMultiRegionTrail.asInstanceOf[js.Any])
    if (isOrganizationTrail != null) __obj.updateDynamic("isOrganizationTrail")(isOrganizationTrail.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix.asInstanceOf[js.Any])
    if (snsTopicName != null) __obj.updateDynamic("snsTopicName")(snsTopicName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailArgs]
  }
}

