package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitTreeDiffEntry extends js.Object {
  /**
    * SHA1 hash of the object in the base tree, if it exists. Will be null in case of adds.
    */
  var baseObjectId: java.lang.String
  /**
    * Type of change that affected this entry.
    */
  var changeType: VersionControlChangeType
  /**
    * Object type of the tree entry. Blob, Tree or Commit("submodule")
    */
  var objectType: GitObjectType
  /**
    * Relative path in base and target trees.
    */
  var path: java.lang.String
  /**
    * SHA1 hash of the object in the target tree, if it exists. Will be null in case of deletes.
    */
  var targetObjectId: java.lang.String
}

object GitTreeDiffEntry {
  @scala.inline
  def apply(
    baseObjectId: java.lang.String,
    changeType: VersionControlChangeType,
    objectType: GitObjectType,
    path: java.lang.String,
    targetObjectId: java.lang.String
  ): GitTreeDiffEntry = {
    val __obj = js.Dynamic.literal(baseObjectId = baseObjectId, changeType = changeType, objectType = objectType, path = path, targetObjectId = targetObjectId)
  
    __obj.asInstanceOf[GitTreeDiffEntry]
  }
}

