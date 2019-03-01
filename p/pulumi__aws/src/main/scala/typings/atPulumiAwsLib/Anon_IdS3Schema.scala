package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdS3Schema extends js.Object {
  var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var s3: atPulumiPulumiLib.resourceMod.Input[Anon_BucketArnFileKey]
  var schema: atPulumiPulumiLib.resourceMod.Input[Anon_RecordColumnsRecordEncoding]
  var tableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_IdS3Schema {
  @scala.inline
  def apply(
    s3: atPulumiPulumiLib.resourceMod.Input[Anon_BucketArnFileKey],
    schema: atPulumiPulumiLib.resourceMod.Input[Anon_RecordColumnsRecordEncoding],
    tableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    id: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_IdS3Schema = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdS3Schema]
  }
}

