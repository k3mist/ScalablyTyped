package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributionType extends ContributionBase {
  /**
    * Controls whether or not contributions of this type have the type indexed for queries. This allows clients to find all extensions that have a contribution of this type.  NOTE: Only TrustedPartners are allowed to specify indexed contribution types.
    */
  var indexed: scala.Boolean
  /**
    * Friendly name of the contribution/type
    */
  var name: java.lang.String
  /**
    * Describes the allowed properties for this contribution type
    */
  var properties: org.scalablytyped.runtime.StringDictionary[ContributionPropertyDescription]
}

object ContributionType {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: java.lang.String,
    indexed: scala.Boolean,
    name: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[ContributionPropertyDescription],
    visibleTo: js.Array[java.lang.String]
  ): ContributionType = {
    val __obj = js.Dynamic.literal(description = description, id = id, indexed = indexed, name = name, properties = properties, visibleTo = visibleTo)
  
    __obj.asInstanceOf[ContributionType]
  }
}

