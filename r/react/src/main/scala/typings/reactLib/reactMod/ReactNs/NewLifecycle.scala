package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This should be "infer SS" but can't use it yet
trait NewLifecycle[P, S, SS] extends js.Object {
  /**
    * Called immediately after updating occurs. Not called for the initial render.
    *
    * The snapshot is only present if getSnapshotBeforeUpdate is present and returns non-null.
    */
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ stdLib.Readonly[P], 
      /* prevState */ stdLib.Readonly[S], 
      /* snapshot */ js.UndefOr[SS], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Runs before React applies the result of `render` to the document, and
    * returns an object to be given to componentDidUpdate. Useful for saving
    * things such as scroll position before `render` causes changes to it.
    *
    * Note: the presence of getSnapshotBeforeUpdate prevents any of the deprecated
    * lifecycle events from running.
    */
  var getSnapshotBeforeUpdate: js.UndefOr[
    js.Function2[
      /* prevProps */ stdLib.Readonly[P], 
      /* prevState */ stdLib.Readonly[S], 
      SS | scala.Null
    ]
  ] = js.undefined
}

object NewLifecycle {
  @scala.inline
  def apply[P, S, SS](
    componentDidUpdate: js.Function3[
      /* prevProps */ stdLib.Readonly[P], 
      /* prevState */ stdLib.Readonly[S], 
      /* snapshot */ js.UndefOr[SS], 
      scala.Unit
    ] = null,
    getSnapshotBeforeUpdate: js.Function2[
      /* prevProps */ stdLib.Readonly[P], 
      /* prevState */ stdLib.Readonly[S], 
      SS | scala.Null
    ] = null
  ): NewLifecycle[P, S, SS] = {
    val __obj = js.Dynamic.literal()
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(componentDidUpdate)
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(getSnapshotBeforeUpdate)
    __obj.asInstanceOf[NewLifecycle[P, S, SS]]
  }
}

