package typings
package typesafeDashActionsLib.distCreateDashAsyncDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncActionBuilder[T1 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T2 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T3 /* <: typesafeDashActionsLib.distTypesMod.StringType */, P1, P2, P3] extends js.Object {
  var failure: typesafeDashActionsLib.distTypesMod.FsaBuilder[
    T3, 
    typesafeDashActionsLib.distTypesMod.Box[P3], 
    typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
  ]
  var request: typesafeDashActionsLib.distTypesMod.FsaBuilder[
    T1, 
    typesafeDashActionsLib.distTypesMod.Box[P1], 
    typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
  ]
  var success: typesafeDashActionsLib.distTypesMod.FsaBuilder[
    T2, 
    typesafeDashActionsLib.distTypesMod.Box[P2], 
    typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
  ]
}

object AsyncActionBuilder {
  @scala.inline
  def apply[T1 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T2 /* <: typesafeDashActionsLib.distTypesMod.StringType */, T3 /* <: typesafeDashActionsLib.distTypesMod.StringType */, P1, P2, P3](
    failure: typesafeDashActionsLib.distTypesMod.FsaBuilder[
      T3, 
      typesafeDashActionsLib.distTypesMod.Box[P3], 
      typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
    ],
    request: typesafeDashActionsLib.distTypesMod.FsaBuilder[
      T1, 
      typesafeDashActionsLib.distTypesMod.Box[P1], 
      typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
    ],
    success: typesafeDashActionsLib.distTypesMod.FsaBuilder[
      T2, 
      typesafeDashActionsLib.distTypesMod.Box[P2], 
      typesafeDashActionsLib.distTypesMod.Box[scala.Unit]
    ]
  ): AsyncActionBuilder[T1, T2, T3, P1, P2, P3] = {
    val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsyncActionBuilder[T1, T2, T3, P1, P2, P3]]
  }
}

