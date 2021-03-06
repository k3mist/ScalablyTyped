package typings
package nodegitLib.statusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/status", "Status")
@js.native
class Status () extends js.Object

/* static members */
@JSImport("nodegit/status", "Status")
@js.native
object Status extends js.Object {
  def byIndex(statuslist: nodegitLib.statusDashListMod.StatusList, idx: scala.Double): nodegitLib.statusDashEntryMod.StatusEntry = js.native
  def file(repo: nodegitLib.repositoryMod.Repository, path: java.lang.String): scala.Double = js.native
  def foreach(repo: nodegitLib.repositoryMod.Repository): js.Promise[scala.Double] = js.native
  def foreach(repo: nodegitLib.repositoryMod.Repository, callback: js.Function): js.Promise[scala.Double] = js.native
  def foreachExt(repo: nodegitLib.repositoryMod.Repository): js.Promise[scala.Double] = js.native
  def foreachExt(repo: nodegitLib.repositoryMod.Repository, opts: nodegitLib.statusDashOptionsMod.StatusOptions): js.Promise[scala.Double] = js.native
  def foreachExt(
    repo: nodegitLib.repositoryMod.Repository,
    opts: nodegitLib.statusDashOptionsMod.StatusOptions,
    callback: js.Function
  ): js.Promise[scala.Double] = js.native
  def shouldIgnore(ignored: scala.Double, repo: nodegitLib.repositoryMod.Repository, path: java.lang.String): scala.Double = js.native
}

