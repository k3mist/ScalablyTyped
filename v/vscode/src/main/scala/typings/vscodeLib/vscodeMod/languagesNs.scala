package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "languages")
@js.native
object languagesNs extends js.Object {
  def createDiagnosticCollection(): vscodeLib.vscodeMod.DiagnosticCollection = js.native
  def createDiagnosticCollection(name: java.lang.String): vscodeLib.vscodeMod.DiagnosticCollection = js.native
  def getLanguages(): vscodeLib.Thenable[js.Array[java.lang.String]] = js.native
  def `match`(selector: vscodeLib.vscodeMod.DocumentSelector, document: vscodeLib.vscodeMod.TextDocument): scala.Double = js.native
  def registerCodeActionsProvider(selector: vscodeLib.vscodeMod.DocumentSelector, provider: vscodeLib.vscodeMod.CodeActionProvider): vscodeLib.vscodeMod.Disposable = js.native
  def registerCodeLensProvider(selector: vscodeLib.vscodeMod.DocumentSelector, provider: vscodeLib.vscodeMod.CodeLensProvider): vscodeLib.vscodeMod.Disposable = js.native
  def registerCompletionItemProvider(
    selector: vscodeLib.vscodeMod.DocumentSelector,
    provider: vscodeLib.vscodeMod.CompletionItemProvider,
    triggerCharacters: java.lang.String*
  ): vscodeLib.vscodeMod.Disposable = js.native
  def registerDefinitionProvider(selector: vscodeLib.vscodeMod.DocumentSelector, provider: vscodeLib.vscodeMod.DefinitionProvider): vscodeLib.vscodeMod.Disposable = js.native
  def registerDocumentFormattingEditProvider(
    selector: vscodeLib.vscodeMod.DocumentSelector,
    provider: vscodeLib.vscodeMod.DocumentFormattingEditProvider
  ): vscodeLib.vscodeMod.Disposable = js.native
  def registerDocumentHighlightProvider(
    selector: vscodeLib.vscodeMod.DocumentSelector,
    provider: vscodeLib.vscodeMod.DocumentHighlightProvider
  ): vscodeLib.vscodeMod.Disposable = js.native
  def registerDocumentLinkProvider(selector: vscodeLib.vscodeMod.DocumentSelector, provider: vscodeLib.vscodeMod.DocumentLinkProvider): vscodeLib.vscodeMod.Disposable = js.native
  def registerDocumentRangeFormattingEditProvider(
    selector: vscodeLib.vscodeMod.DocumentSelector,
    provider: vscodeLib.vscodeMod.DocumentRangeFormattingEditProvider
  ): vscodeLib.vscodeMod.Disposable = js.native
  def registerDocumentSymbolProvider(
    selector: vscodeLib.vscodeMod.DocumentSelector,
    provider: vscodeLib.vscodeMod.DocumentSymbolProvider
  ): vscodeLib.vscodeMod.Disposable = js.native
  def registerHoverProvider(selector: vscodeLib.vscodeMod.DocumentSelector, provider: vscodeLib.vscodeMod.HoverProvider): vscodeLib.vscodeMod.Disposable = js.native
  def registerImplementationProvider(
    selector: vscodeLib.vscodeMod.DocumentSelector,
    provider: vscodeLib.vscodeMod.ImplementationProvider
  ): vscodeLib.vscodeMod.Disposable = js.native
  def registerOnTypeFormattingEditProvider(
    selector: vscodeLib.vscodeMod.DocumentSelector,
    provider: vscodeLib.vscodeMod.OnTypeFormattingEditProvider,
    firstTriggerCharacter: java.lang.String,
    moreTriggerCharacter: java.lang.String*
  ): vscodeLib.vscodeMod.Disposable = js.native
  def registerReferenceProvider(selector: vscodeLib.vscodeMod.DocumentSelector, provider: vscodeLib.vscodeMod.ReferenceProvider): vscodeLib.vscodeMod.Disposable = js.native
  def registerRenameProvider(selector: vscodeLib.vscodeMod.DocumentSelector, provider: vscodeLib.vscodeMod.RenameProvider): vscodeLib.vscodeMod.Disposable = js.native
  def registerSignatureHelpProvider(
    selector: vscodeLib.vscodeMod.DocumentSelector,
    provider: vscodeLib.vscodeMod.SignatureHelpProvider,
    triggerCharacters: java.lang.String*
  ): vscodeLib.vscodeMod.Disposable = js.native
  def registerTypeDefinitionProvider(
    selector: vscodeLib.vscodeMod.DocumentSelector,
    provider: vscodeLib.vscodeMod.TypeDefinitionProvider
  ): vscodeLib.vscodeMod.Disposable = js.native
  def registerWorkspaceSymbolProvider(provider: vscodeLib.vscodeMod.WorkspaceSymbolProvider): vscodeLib.vscodeMod.Disposable = js.native
  def setLanguageConfiguration(language: java.lang.String, configuration: vscodeLib.vscodeMod.LanguageConfiguration): vscodeLib.vscodeMod.Disposable = js.native
}

