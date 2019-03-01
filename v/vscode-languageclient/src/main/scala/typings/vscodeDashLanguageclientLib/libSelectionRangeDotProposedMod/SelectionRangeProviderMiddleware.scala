package typings
package vscodeDashLanguageclientLib.libSelectionRangeDotProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRangeProviderMiddleware extends js.Object {
  var provideSelectionRanges: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ /* document */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideSelectionRangeSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VSelectionRange>> */ _
    ]
  ] = js.undefined
}

object SelectionRangeProviderMiddleware {
  @scala.inline
  def apply(
    provideSelectionRanges: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ /* document */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideSelectionRangeSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VSelectionRange>> */ _
    ] = null
  ): SelectionRangeProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideSelectionRanges != null) __obj.updateDynamic("provideSelectionRanges")(provideSelectionRanges)
    __obj.asInstanceOf[SelectionRangeProviderMiddleware]
  }
}

