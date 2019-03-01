package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcChangesetRef extends js.Object {
  /**
    * A collection of REST reference links.
    */
  var _links: js.Any
  /**
    * Alias or display name of user
    */
  var author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Id of the changeset.
    */
  var changesetId: scala.Double
  /**
    * Alias or display name of user
    */
  var checkedInBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Comment for the changeset.
    */
  var comment: java.lang.String
  /**
    * Was the Comment result truncated?
    */
  var commentTruncated: scala.Boolean
  /**
    * Creation date of the changeset.
    */
  var createdDate: stdLib.Date
  /**
    * URL to retrieve the item.
    */
  var url: java.lang.String
}

object TfvcChangesetRef {
  @scala.inline
  def apply(
    _links: js.Any,
    author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    changesetId: scala.Double,
    checkedInBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    comment: java.lang.String,
    commentTruncated: scala.Boolean,
    createdDate: stdLib.Date,
    url: java.lang.String
  ): TfvcChangesetRef = {
    val __obj = js.Dynamic.literal(_links = _links, author = author, changesetId = changesetId, checkedInBy = checkedInBy, comment = comment, commentTruncated = commentTruncated, createdDate = createdDate, url = url)
  
    __obj.asInstanceOf[TfvcChangesetRef]
  }
}

