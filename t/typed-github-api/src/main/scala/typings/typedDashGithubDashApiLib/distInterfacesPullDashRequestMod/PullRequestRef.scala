package typings
package typedDashGithubDashApiLib.distInterfacesPullDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestRef extends js.Object {
  val number: scala.Double
  def loadAsync(): js.Promise[PullRequest | scala.Null]
}

object PullRequestRef {
  @scala.inline
  def apply(loadAsync: js.Function0[js.Promise[PullRequest | scala.Null]], number: scala.Double): PullRequestRef = {
    val __obj = js.Dynamic.literal(loadAsync = loadAsync, number = number)
  
    __obj.asInstanceOf[PullRequestRef]
  }
}

