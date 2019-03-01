package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecordColumnsRecordEncoding extends js.Object {
  var recordColumns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_MappingName]]]
  var recordEncoding: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var recordFormat: atPulumiPulumiLib.resourceMod.Input[Anon_MappingParametersRecordFormatType]
}

object Anon_RecordColumnsRecordEncoding {
  @scala.inline
  def apply(
    recordColumns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_MappingName]]],
    recordFormat: atPulumiPulumiLib.resourceMod.Input[Anon_MappingParametersRecordFormatType],
    recordEncoding: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_RecordColumnsRecordEncoding = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    if (recordEncoding != null) __obj.updateDynamic("recordEncoding")(recordEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RecordColumnsRecordEncoding]
  }
}

