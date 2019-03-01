package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.download method.
  */
trait IDownloadProperties extends js.Object {
  /**
    * The path to the file to download. For information on specifying paths
    * for REST objects, see REST reference.
    * http://msdn.microsoft.com/en-us/library/live/hh243648.aspx
    */
  var path: java.lang.String
}

object IDownloadProperties {
  @scala.inline
  def apply(path: java.lang.String): IDownloadProperties = {
    val __obj = js.Dynamic.literal(path = path)
  
    __obj.asInstanceOf[IDownloadProperties]
  }
}

