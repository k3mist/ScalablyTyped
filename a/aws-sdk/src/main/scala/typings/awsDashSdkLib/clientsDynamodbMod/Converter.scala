package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/dynamodb", "Converter")
@js.native
class Converter ()
  extends awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.Converter

/* static members */
@JSImport("aws-sdk/clients/dynamodb", "Converter")
@js.native
object Converter extends js.Object {
  def input(data: js.Any): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue = js.native
  def input(data: js.Any, options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue = js.native
  def marshall(data: org.scalablytyped.runtime.StringDictionary[js.Any]): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap = js.native
  def marshall(
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
  ): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap = js.native
  def output(data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue): js.Any = js.native
  def output(
    data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue,
    options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
  ): js.Any = js.native
  def unmarshall(data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def unmarshall(
    data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap,
    options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

