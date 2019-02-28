package typings
package mongoritoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongoritoMod {
  type Class[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type ModelClass = Class[Model]
  type Plugin = js.Function1[
    /* modelClass */ ModelClass, 
    js.Function1[
      /* store */ PluginStore, 
      js.Function1[/* next */ PluginNext, js.Function1[/* action */ Action, scala.Unit]]
    ]
  ]
  type PluginNext = js.Function1[/* action */ Action, scala.Unit]
  type Reducer[S] = js.Function2[
    /* state */ S, 
    /* action */ Action, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer */ js.Object
  ]
  type ReducerModifier = js.Function1[/* reducerState */ ReducerState, ReducerState]
  type ReducerState = DefaultReducer with (stdLib.Map[_, Reducer[_]])
  type State = DefaultState with js.Any
}
