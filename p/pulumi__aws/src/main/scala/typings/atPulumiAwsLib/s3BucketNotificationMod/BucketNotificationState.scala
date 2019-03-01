package typings
package atPulumiAwsLib.s3BucketNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketNotificationState extends js.Object {
  /**
    * The name of the bucket to put notification configuration.
    */
  val bucket: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Used to configure notifications to a Lambda Function (documented below).
    */
  val lambdaFunctions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn]
      ]
    ]
  ] = js.undefined
  /**
    * The notification configuration to SQS Queue (documented below).
    */
  val queues: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdQueueArn]
      ]
    ]
  ] = js.undefined
  /**
    * The notification configuration to SNS Topic (documented below).
    */
  val topics: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdTopicArn]
      ]
    ]
  ] = js.undefined
}

object BucketNotificationState {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    lambdaFunctions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn]
      ]
    ] = null,
    queues: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdQueueArn]
      ]
    ] = null,
    topics: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdTopicArn]
      ]
    ] = null
  ): BucketNotificationState = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (lambdaFunctions != null) __obj.updateDynamic("lambdaFunctions")(lambdaFunctions.asInstanceOf[js.Any])
    if (queues != null) __obj.updateDynamic("queues")(queues.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationState]
  }
}

