package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a CMIS document version. */
trait CmisVersion extends js.Object {
  /** contains the author that created the version. */
  var Author: java.lang.String
  /** contains the comment the author has left. */
  var Comment: java.lang.String
  /** unique ID of the Cmis version */
  var Id: java.lang.String
  /** specifies the time when the revision was created. */
  var TimeStamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
}

object CmisVersion {
  @scala.inline
  def apply(
    Author: java.lang.String,
    Comment: java.lang.String,
    Id: java.lang.String,
    TimeStamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  ): CmisVersion = {
    val __obj = js.Dynamic.literal(Author = Author, Comment = Comment, Id = Id, TimeStamp = TimeStamp)
  
    __obj.asInstanceOf[CmisVersion]
  }
}

