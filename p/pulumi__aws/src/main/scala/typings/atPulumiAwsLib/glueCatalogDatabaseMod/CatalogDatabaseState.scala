package typings
package atPulumiAwsLib.glueCatalogDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatalogDatabaseState extends js.Object {
  /**
    * ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
    */
  val catalogId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Description of the database.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The location of the database (for example, an HDFS path).
    */
  val locationUri: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the database.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of key-value pairs that define parameters and properties of the database.
    */
  val parameters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ]
  ] = js.undefined
}

object CatalogDatabaseState {
  @scala.inline
  def apply(
    catalogId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    locationUri: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    parameters: atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ] = null
  ): CatalogDatabaseState = {
    val __obj = js.Dynamic.literal()
    if (catalogId != null) __obj.updateDynamic("catalogId")(catalogId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (locationUri != null) __obj.updateDynamic("locationUri")(locationUri.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogDatabaseState]
  }
}

