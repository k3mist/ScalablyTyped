package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceSymbolProvider extends js.Object {
  /**
  		 * Given a symbol fill in its [location](#SymbolInformation.location). This method is called whenever a symbol
  		 * is selected in the UI. Providers can implement this method and return incomplete symbols from
  		 * [`provideWorkspaceSymbols`](#WorkspaceSymbolProvider.provideWorkspaceSymbols) which often helps to improve
  		 * performance.
  		 *
  		 * @param symbol The symbol that is to be resolved. Guaranteed to be an instance of an object returned from an
  		 * earlier call to `provideWorkspaceSymbols`.
  		 * @param token A cancellation token.
  		 * @return The resolved symbol or a thenable that resolves to that. When no result is returned,
  		 * the given `symbol` is used.
  		 */
  var resolveWorkspaceSymbol: js.UndefOr[
    js.Function2[
      /* symbol */ SymbolInformation, 
      /* token */ CancellationToken, 
      ProviderResult[SymbolInformation]
    ]
  ] = js.undefined
  /**
  		 * Project-wide search for a symbol matching the given query string. It is up to the provider
  		 * how to search given the query string, like substring, indexOf etc. To improve performance implementors can
  		 * skip the [location](#SymbolInformation.location) of symbols and implement `resolveWorkspaceSymbol` to do that
  		 * later.
  		 *
  		 * The `query`-parameter should be interpreted in a *relaxed way* as the editor will apply its own highlighting
  		 * and scoring on the results. A good rule of thumb is to match case-insensitive and to simply check that the
  		 * characters of *query* appear in their order in a candidate symbol. Don't use prefix, substring, or similar
  		 * strict matching.
  		 *
  		 * @param query A non-empty query string.
  		 * @param token A cancellation token.
  		 * @return An array of document highlights or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideWorkspaceSymbols(query: java.lang.String, token: CancellationToken): ProviderResult[js.Array[SymbolInformation]]
}

object WorkspaceSymbolProvider {
  @scala.inline
  def apply(
    provideWorkspaceSymbols: (java.lang.String, CancellationToken) => ProviderResult[js.Array[SymbolInformation]],
    resolveWorkspaceSymbol: (/* symbol */ SymbolInformation, /* token */ CancellationToken) => ProviderResult[SymbolInformation] = null
  ): WorkspaceSymbolProvider = {
    val __obj = js.Dynamic.literal(provideWorkspaceSymbols = js.Any.fromFunction2(provideWorkspaceSymbols))
    if (resolveWorkspaceSymbol != null) __obj.updateDynamic("resolveWorkspaceSymbol")(js.Any.fromFunction2(resolveWorkspaceSymbol))
    __obj.asInstanceOf[WorkspaceSymbolProvider]
  }
}

