package typings
package router5Lib.typesTypesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var onStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTransitionCancel: js.UndefOr[
    js.Function2[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      scala.Unit
    ]
  ] = js.undefined
  var onTransitionError: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* err */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var onTransitionStart: js.UndefOr[
    js.Function2[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      scala.Unit
    ]
  ] = js.undefined
  var onTransitionSuccess: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* opts */ js.UndefOr[router5Lib.typesTypesBaseMod.NavigationOptions], 
      scala.Unit
    ]
  ] = js.undefined
  var teardown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    onStart: js.Function0[scala.Unit] = null,
    onStop: js.Function0[scala.Unit] = null,
    onTransitionCancel: js.Function2[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      scala.Unit
    ] = null,
    onTransitionError: js.Function3[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* err */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onTransitionStart: js.Function2[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      scala.Unit
    ] = null,
    onTransitionSuccess: js.Function3[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* opts */ js.UndefOr[router5Lib.typesTypesBaseMod.NavigationOptions], 
      scala.Unit
    ] = null,
    teardown: js.Function0[scala.Unit] = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    if (onStop != null) __obj.updateDynamic("onStop")(onStop)
    if (onTransitionCancel != null) __obj.updateDynamic("onTransitionCancel")(onTransitionCancel)
    if (onTransitionError != null) __obj.updateDynamic("onTransitionError")(onTransitionError)
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(onTransitionStart)
    if (onTransitionSuccess != null) __obj.updateDynamic("onTransitionSuccess")(onTransitionSuccess)
    if (teardown != null) __obj.updateDynamic("teardown")(teardown)
    __obj.asInstanceOf[Plugin]
  }
}

