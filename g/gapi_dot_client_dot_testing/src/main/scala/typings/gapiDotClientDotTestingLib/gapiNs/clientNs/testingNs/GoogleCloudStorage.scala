package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudStorage extends js.Object {
  /**
    * The path to a directory in GCS that will
    * eventually contain the results for this test.
    * The requesting user must have write access on the bucket in the supplied
    * path.
    * Required
    */
  var gcsPath: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleCloudStorage {
  @scala.inline
  def apply(gcsPath: java.lang.String = null): GoogleCloudStorage = {
    val __obj = js.Dynamic.literal()
    if (gcsPath != null) __obj.updateDynamic("gcsPath")(gcsPath)
    __obj.asInstanceOf[GoogleCloudStorage]
  }
}

