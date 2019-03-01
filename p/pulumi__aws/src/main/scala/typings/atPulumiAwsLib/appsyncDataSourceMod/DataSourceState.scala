package typings
package atPulumiAwsLib.appsyncDataSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceState extends js.Object {
  /**
    * The API ID for the GraphQL API for the DataSource.
    */
  val apiId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A description of the DataSource.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * DynamoDB settings. See below
    */
  val dynamodbConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_RegionTableName]] = js.undefined
  /**
    * Amazon Elasticsearch settings. See below
    */
  val elasticsearchConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EndpointRegion]] = js.undefined
  /**
    * HTTP settings. See below
    */
  val httpConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EndpointInput]] = js.undefined
  /**
    * AWS Lambda settings. See below
    */
  val lambdaConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FunctionArnInput]] = js.undefined
  /**
    * A user-supplied name for the DataSource.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM service role ARN for the data source.
    */
  val serviceRoleArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object DataSourceState {
  @scala.inline
  def apply(
    apiId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    dynamodbConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_RegionTableName] = null,
    elasticsearchConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EndpointRegion] = null,
    httpConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EndpointInput] = null,
    lambdaConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FunctionArnInput] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    serviceRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): DataSourceState = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodbConfig != null) __obj.updateDynamic("dynamodbConfig")(dynamodbConfig.asInstanceOf[js.Any])
    if (elasticsearchConfig != null) __obj.updateDynamic("elasticsearchConfig")(elasticsearchConfig.asInstanceOf[js.Any])
    if (httpConfig != null) __obj.updateDynamic("httpConfig")(httpConfig.asInstanceOf[js.Any])
    if (lambdaConfig != null) __obj.updateDynamic("lambdaConfig")(lambdaConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceState]
  }
}

