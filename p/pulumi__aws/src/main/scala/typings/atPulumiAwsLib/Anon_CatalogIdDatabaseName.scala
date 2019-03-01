package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CatalogIdDatabaseName extends js.Object {
  var catalogId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var databaseName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var region: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var tableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var versionId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_CatalogIdDatabaseName {
  @scala.inline
  def apply(
    databaseName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    tableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    catalogId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    region: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    versionId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_CatalogIdDatabaseName = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (catalogId != null) __obj.updateDynamic("catalogId")(catalogId.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CatalogIdDatabaseName]
  }
}

