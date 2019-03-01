package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcShelvesetRequestData extends js.Object {
  /**
    * Whether to include policyOverride and notes Only applies when requesting a single deep shelveset
    */
  var includeDetails: scala.Boolean
  /**
    * Whether to include the _links field on the shallow references. Does not apply when requesting a single deep shelveset object. Links will always be included in the deep shelveset.
    */
  var includeLinks: scala.Boolean
  /**
    * Whether to include workItems
    */
  var includeWorkItems: scala.Boolean
  /**
    * Max number of changes to include
    */
  var maxChangeCount: scala.Double
  /**
    * Max length of comment
    */
  var maxCommentLength: scala.Double
  /**
    * Shelveset's name
    */
  var name: java.lang.String
  /**
    * Owner's ID. Could be a name or a guid.
    */
  var owner: java.lang.String
}

object TfvcShelvesetRequestData {
  @scala.inline
  def apply(
    includeDetails: scala.Boolean,
    includeLinks: scala.Boolean,
    includeWorkItems: scala.Boolean,
    maxChangeCount: scala.Double,
    maxCommentLength: scala.Double,
    name: java.lang.String,
    owner: java.lang.String
  ): TfvcShelvesetRequestData = {
    val __obj = js.Dynamic.literal(includeDetails = includeDetails, includeLinks = includeLinks, includeWorkItems = includeWorkItems, maxChangeCount = maxChangeCount, maxCommentLength = maxCommentLength, name = name, owner = owner)
  
    __obj.asInstanceOf[TfvcShelvesetRequestData]
  }
}

