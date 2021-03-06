package typings
package atPulumiPulumiLib.runtimeClosureCodePathsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/closure/codePaths", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeCodePaths(): js.Promise[
    stdLib.Map[
      java.lang.String, 
      atPulumiPulumiLib.assetMod.Asset | atPulumiPulumiLib.assetMod.Archive
    ]
  ] = js.native
  def computeCodePaths(extraIncludePaths: js.Array[java.lang.String]): js.Promise[
    stdLib.Map[
      java.lang.String, 
      atPulumiPulumiLib.assetMod.Asset | atPulumiPulumiLib.assetMod.Archive
    ]
  ] = js.native
  def computeCodePaths(extraIncludePaths: js.Array[java.lang.String], extraIncludePackages: js.Array[java.lang.String]): js.Promise[
    stdLib.Map[
      java.lang.String, 
      atPulumiPulumiLib.assetMod.Asset | atPulumiPulumiLib.assetMod.Archive
    ]
  ] = js.native
  def computeCodePaths(
    extraIncludePaths: js.Array[java.lang.String],
    extraIncludePackages: js.Array[java.lang.String],
    extraExcludePackages: js.Array[java.lang.String]
  ): js.Promise[
    stdLib.Map[
      java.lang.String, 
      atPulumiPulumiLib.assetMod.Asset | atPulumiPulumiLib.assetMod.Archive
    ]
  ] = js.native
  def computeCodePaths(options: CodePathOptions): js.Promise[
    stdLib.Map[
      java.lang.String, 
      atPulumiPulumiLib.assetMod.Asset | atPulumiPulumiLib.assetMod.Archive
    ]
  ] = js.native
}

