package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcItemDescriptor extends js.Object {
  var path: java.lang.String
  var recursionLevel: VersionControlRecursionType
  var version: java.lang.String
  var versionOption: TfvcVersionOption
  var versionType: TfvcVersionType
}

object TfvcItemDescriptor {
  @scala.inline
  def apply(
    path: java.lang.String,
    recursionLevel: VersionControlRecursionType,
    version: java.lang.String,
    versionOption: TfvcVersionOption,
    versionType: TfvcVersionType
  ): TfvcItemDescriptor = {
    val __obj = js.Dynamic.literal(path = path, recursionLevel = recursionLevel, version = version, versionOption = versionOption, versionType = versionType)
  
    __obj.asInstanceOf[TfvcItemDescriptor]
  }
}

