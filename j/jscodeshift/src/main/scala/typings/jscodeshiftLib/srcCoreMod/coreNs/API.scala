package typings
package jscodeshiftLib.srcCoreMod.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API extends js.Object {
  @JSName("j")
  var j_Original: JSCodeshift = js.native
  @JSName("jscodeshift")
  var jscodeshift_Original: JSCodeshift = js.native
  @JSName("stats")
  var stats_Original: Stats = js.native
  def j(source: java.lang.String): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def j(source: java.lang.String, options: Options): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def j(source: js.Array[ASTNode | ASTPath[ASTNode]]): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def j(source: ASTNode): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def j(source: ASTPath[ASTNode]): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def jscodeshift(source: java.lang.String): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def jscodeshift(source: java.lang.String, options: Options): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def jscodeshift(source: js.Array[ASTNode | ASTPath[ASTNode]]): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def jscodeshift(source: ASTNode): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def jscodeshift(source: ASTPath[ASTNode]): jscodeshiftLib.srcCollectionMod.Collection[_] = js.native
  def report(msg: java.lang.String): scala.Unit = js.native
  /**
    * Helper function to collect data during --dry runs.
    * This function keeps a counter for how often it was called with a specific argument.
    * The result is shown in the console. Useful for finding out how many files match a criterion.
    */
  def stats(name: java.lang.String): scala.Unit = js.native
  def stats(name: java.lang.String, quantity: scala.Double): scala.Unit = js.native
}

