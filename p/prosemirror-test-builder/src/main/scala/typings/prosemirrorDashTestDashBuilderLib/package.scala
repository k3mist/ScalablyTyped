package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prosemirrorDashTestDashBuilderLib {
  type Args = js.Array[
    java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TaggedProsemirrorNode */ js.Any)
  ]
  type MarkBuilderMethod[S /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any */] = js.Function1[
    /* args */ Args, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TaggedFlatObject<S> */ js.Any
  ]
  type NodeBuilderMethod[S /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any */] = js.Function1[
    /* args */ Args, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TaggedProsemirrorNode<S> */ js.Any
  ]
}
