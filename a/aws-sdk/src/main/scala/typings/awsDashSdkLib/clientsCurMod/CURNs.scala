package typings
package awsDashSdkLib.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cur", "CUR")
@js.native
object CURNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait DeleteReportDefinitionRequest extends js.Object {
    var ReportName: js.UndefOr[ReportName] = js.undefined
  }
  
  trait DeleteReportDefinitionResponse extends js.Object {
    var ResponseMessage: js.UndefOr[DeleteResponseMessage] = js.undefined
  }
  
  trait DescribeReportDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    var NextToken: js.UndefOr[GenericString] = js.undefined
  }
  
  trait DescribeReportDefinitionsResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString] = js.undefined
    var ReportDefinitions: js.UndefOr[ReportDefinitionList] = js.undefined
  }
  
  trait PutReportDefinitionRequest extends js.Object {
    var ReportDefinition: ReportDefinition
  }
  
  trait PutReportDefinitionResponse extends js.Object
  
  trait ReportDefinition extends js.Object {
    var AdditionalArtifacts: js.UndefOr[AdditionalArtifactList] = js.undefined
    var AdditionalSchemaElements: SchemaElementList
    var Compression: CompressionFormat
    var Format: ReportFormat
    var ReportName: ReportName
    var S3Bucket: S3Bucket
    var S3Prefix: S3Prefix
    var S3Region: AWSRegion
    var TimeUnit: TimeUnit
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Delete a specified report definition
      */
    def deleteReportDefinition(): awsDashSdkLib.libRequestMod.Request[DeleteReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReportDefinition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReportDefinitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a specified report definition
      */
    def deleteReportDefinition(params: DeleteReportDefinitionRequest): awsDashSdkLib.libRequestMod.Request[DeleteReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReportDefinition(
      params: DeleteReportDefinitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReportDefinitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describe a list of report definitions owned by the account
      */
    def describeReportDefinitions(): awsDashSdkLib.libRequestMod.Request[DescribeReportDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReportDefinitions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReportDefinitionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReportDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describe a list of report definitions owned by the account
      */
    def describeReportDefinitions(params: DescribeReportDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeReportDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReportDefinitions(
      params: DescribeReportDefinitionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReportDefinitionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReportDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new report definition
      */
    def putReportDefinition(): awsDashSdkLib.libRequestMod.Request[PutReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putReportDefinition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutReportDefinitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new report definition
      */
    def putReportDefinition(params: PutReportDefinitionRequest): awsDashSdkLib.libRequestMod.Request[PutReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putReportDefinition(
      params: PutReportDefinitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutReportDefinitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait _AWSRegion extends js.Object
  
  trait _AdditionalArtifact extends js.Object
  
  trait _CompressionFormat extends js.Object
  
  trait _TimeUnit extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AWSRegion = _AWSRegion | java.lang.String
  type AdditionalArtifact = _AdditionalArtifact | java.lang.String
  type AdditionalArtifactList = js.Array[AdditionalArtifact]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CompressionFormat = _CompressionFormat | java.lang.String
  type DeleteResponseMessage = java.lang.String
  type GenericString = java.lang.String
  type MaxResults = scala.Double
  type ReportDefinitionList = js.Array[ReportDefinition]
  type ReportFormat = awsDashSdkLib.awsDashSdkLibStrings.textORcsv | java.lang.String
  type ReportName = java.lang.String
  type S3Bucket = java.lang.String
  type S3Prefix = java.lang.String
  type SchemaElement = awsDashSdkLib.awsDashSdkLibStrings.RESOURCES | java.lang.String
  type SchemaElementList = js.Array[SchemaElement]
  type TimeUnit = _TimeUnit | java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

