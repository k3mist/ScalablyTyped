package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  /** If provided, get source from this location in a Cloud Repo. */
  var repoSource: js.UndefOr[RepoSource] = js.undefined
  /** If provided, get the source from this location in Google Cloud Storage. */
  var storageSource: js.UndefOr[StorageSource] = js.undefined
}

object Source {
  @scala.inline
  def apply(repoSource: RepoSource = null, storageSource: StorageSource = null): Source = {
    val __obj = js.Dynamic.literal()
    if (repoSource != null) __obj.updateDynamic("repoSource")(repoSource)
    if (storageSource != null) __obj.updateDynamic("storageSource")(storageSource)
    __obj.asInstanceOf[Source]
  }
}

