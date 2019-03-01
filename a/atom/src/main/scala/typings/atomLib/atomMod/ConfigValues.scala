package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigValues
  extends // tslint:disable-next-line:no-any
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    *  Allow items to be previewed without adding them to a pane permanently, such as
    *  when single clicking files in the tree view.
    */
  var `core.allowPendingPaneItems`: scala.Boolean
  /**
    *  Trigger the system's beep sound when certain actions cannot be executed or
    *  there are no results.
    */
  var `core.audioBeep`: scala.Boolean
  /** Automatically update Atom when a new release is available. */
  var `core.automaticallyUpdate`: scala.Boolean
  /** Close corresponding editors when a file is deleted outside Atom. */
  var `core.closeDeletedFileTabs`: scala.Boolean
  /**
    *  When a window with no open tabs or panes is given the 'Close Tab' command,
    *  close that window.
    */
  var `core.closeEmptyWindows`: scala.Boolean
  /**
    * Specify whether Atom should use the operating system's color profile (recommended)
    * or an alternative color profile.
    */
  var `core.colorProfile`: atomLib.atomLibStrings.default | atomLib.atomLibStrings.srgb
  /**
    *  Associates scope names (e.g. "source.coffee") with arrays of file extensions
    *  and file names (e.g. ["Cakefile", ".coffee2"]).
    */
  var `core.customFileTypes`: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  /** When the last tab of a pane is closed, remove that pane as well. */
  var `core.destroyEmptyPanes`: scala.Boolean
  /** List of names of installed packages which are not loaded at startup. */
  var `core.disabledPackages`: js.Array[java.lang.String]
  /**
    *  Files and directories ignored by the current project's VCS system will be ignored
    *  by some packages, such as the fuzzy finder and find and replace. For example,
    *  projects using Git have these paths defined in the .gitignore file. Individual
    *  packages might have additional config settings for ignoring VCS ignored files and
    *  folders.
    */
  var `core.excludeVcsIgnoredPaths`: scala.Boolean
  /** Default character set encoding to use when reading and writing files. */
  var `core.fileEncoding`: FileEncoding
  /**
    *  Choose the underlying implementation used to watch for filesystem changes. Emulating
    *  changes will miss any events caused by applications other than Atom, but may help
    *  prevent crashes or freezes.
    */
  var `core.fileSystemWatcher`: atomLib.atomLibStrings.native | atomLib.atomLibStrings.experimental | atomLib.atomLibStrings.poll | atomLib.atomLibStrings.atom
  /**
    *  Follow symbolic links when searching files and when opening files with the fuzzy
    *  finder.
    */
  var `core.followSymlinks`: scala.Boolean
  /**
    *  List of glob patterns. Files and directories matching these patterns will be
    *  ignored by some packages, such as the fuzzy finder and tree view. Individual
    *  packages might have additional config settings for ignoring names.
    */
  var `core.ignoredNames`: js.Array[java.lang.String]
  /**
    *  When checked opens an untitled editor when loading a blank environment (such as
    *  with 'File > New Window' or when "Restore Previous Windows On Start" is unchecked);
    *  otherwise, no editor is opened when loading a blank environment.
    *  This setting has no effect when restoring a previous state.
    */
  var `core.openEmptyEditorOnStart`: scala.Boolean
  /** How many recent projects to show in the Reopen Project menu. */
  var `core.reopenProjectMenuCount`: scala.Double
  /**
    *  When selected 'no', a blank environment is loaded. When selected 'yes' and Atom
    *  is started from the icon or `atom` by itself from the command line, restores the
    *  last state of all Atom windows; otherwise a blank environment is loaded. When
    *  selected 'always', restores the last state of all Atom windows always, no matter
    *  how Atom is started.
    */
  var `core.restorePreviousWindowsOnStart`: atomLib.atomLibStrings.no | atomLib.atomLibStrings.yes | atomLib.atomLibStrings.always
  /**
    *  Allow usage statistics and exception reports to be sent to the Atom team to help
    *  improve the product.
    */
  var `core.telemetryConsent`: atomLib.atomLibStrings.limited | atomLib.atomLibStrings.no | atomLib.atomLibStrings.undecided
  /** Names of UI and syntax themes which will be used when Atom starts. */
  var `core.themes`: js.Array[java.lang.String]
  /** Use detected proxy settings when calling the `apm` command-line tool. */
  var `core.useProxySettingsWhenCallingApm`: scala.Boolean
  /** Experimental: Use the new Tree-sitter parsing system for supported languages. */
  var `core.useTreeSitterParsers`: scala.Boolean
  /** List of names of installed packages which are not automatically updated. */
  var `core.versionPinnedPackages`: js.Array[java.lang.String]
  /** Warn before opening files larger than this number of megabytes. */
  var `core.warnOnLargeFileLimit`: scala.Double
  /** Skip over tab-length runs of leading whitespace when moving the cursor. */
  var `editor.atomicSoftTabs`: scala.Boolean
  /** Automatically indent the cursor when inserting a newline. */
  var `editor.autoIndent`: scala.Boolean
  /** Automatically indent pasted text based on the indentation of the previous line. */
  var `editor.autoIndentOnPaste`: scala.Boolean
  var `editor.commentEnd`: java.lang.String | scala.Null
  var `editor.commentStart`: java.lang.String | scala.Null
  /**
    *  Show confirmation dialog when checking out the HEAD revision and discarding
    *  changes to current file since last commit.
    */
  var `editor.confirmCheckoutHeadRevision`: scala.Boolean
  var `editor.decreaseIndentPattern`: java.lang.String | scala.Null
  var `editor.foldEndPattern`: java.lang.String | scala.Null
  /** The name of the font family used for editor text. */
  var `editor.fontFamily`: java.lang.String
  /** Height in pixels of editor text. */
  var `editor.fontSize`: scala.Double
  var `editor.increaseIndentPattern`: java.lang.String | scala.Null
  /**
    *  A hash of characters Atom will use to render whitespace characters. Keys are
    *  whitespace character types, values are rendered characters (use value false to
    *  turn off individual whitespace character types).
    */
  var `editor.invisibles`: Invisibles
  /** Height of editor lines, as a multiplier of font size. */
  var `editor.lineHeight`: java.lang.String | scala.Double
  /**
    * Defines the maximum width of the editor window before soft wrapping is enforced,
    * in number of characters.
    */
  var `editor.maxScreenLineLength`: scala.Double
  /** A string of non-word characters to define word boundaries. */
  var `editor.nonWordCharacters`: java.lang.String
  /**
    *  Identifies the length of a line which is used when wrapping text with the
    *  `Soft Wrap At Preferred Line Length` setting enabled, in number of characters.
    */
  var `editor.preferredLineLength`: scala.Double
  /** Allow the editor to be scrolled past the end of the last line. */
  var `editor.scrollPastEnd`: scala.Boolean
  /** Determines how fast the editor scrolls when using a mouse or trackpad. */
  var `editor.scrollSensitivity`: scala.Double
  /** Show cursor while there is a selection. */
  var `editor.showCursorOnSelection`: scala.Boolean
  /** Show indentation indicators in the editor. */
  var `editor.showIndentGuide`: scala.Boolean
  /** Render placeholders for invisible characters, such as tabs, spaces and newlines. */
  var `editor.showInvisibles`: scala.Boolean
  /** Show line numbers in the editor's gutter. */
  var `editor.showLineNumbers`: scala.Boolean
  /**
    *  If the `Tab Type` config setting is set to "auto" and autodetection of tab type
    *  from buffer content fails, then this config setting determines whether a soft tab
    *  or a hard tab will be inserted when the Tab key is pressed.
    */
  var `editor.softTabs`: scala.Boolean
  /**
    *  Wraps lines that exceed the width of the window. When `Soft Wrap At Preferred
    *  Line Length` is set, it will wrap to the number of characters defined by the
    *  `Preferred Line Length` setting.
    */
  var `editor.softWrap`: scala.Boolean
  /**
    *  Instead of wrapping lines to the window's width, wrap lines to the number of
    *  characters defined by the `Preferred Line Length` setting. This will only take
    *  effect when the soft wrap config setting is enabled globally or for the current
    *  language.
    *  **Note:** If you want to hide the wrap guide (the vertical line) you can disable
    *  the `wrap-guide` package.
    */
  var `editor.softWrapAtPreferredLineLength`: scala.Boolean
  /**
    *  When soft wrap is enabled, defines length of additional indentation applied to
    *  wrapped lines, in number of characters.
    */
  var `editor.softWrapHangingIndent`: scala.Double
  /** Number of spaces used to represent a tab. */
  var `editor.tabLength`: scala.Double
  /**
    *  Determine character inserted when Tab key is pressed. Possible values: "auto",
    *  "soft" and "hard". When set to "soft" or "hard", soft tabs (spaces) or hard tabs
    *  (tab characters) are used. When set to "auto", the editor auto-detects the tab
    *  type based on the contents of the buffer (it uses the first leading whitespace
    *  on a non-comment line), or uses the value of the Soft Tabs config setting if
    *  auto-detection fails.
    */
  var `editor.tabType`: atomLib.atomLibStrings.auto | atomLib.atomLibStrings.soft | atomLib.atomLibStrings.hard
  /**
    *  Time interval in milliseconds within which text editing operations will be
    *  grouped together in the undo history.
    */
  var `editor.undoGroupingInterval`: scala.Double
  /**
    *  Change the editor font size when pressing the Ctrl key and scrolling the mouse
    *  up/down.
    */
  var `editor.zoomFontWhenCtrlScrolling`: scala.Boolean
}

object ConfigValues {
  @scala.inline
  def apply(
    `core.allowPendingPaneItems`: scala.Boolean,
    `core.audioBeep`: scala.Boolean,
    `core.automaticallyUpdate`: scala.Boolean,
    `core.closeDeletedFileTabs`: scala.Boolean,
    `core.closeEmptyWindows`: scala.Boolean,
    `core.colorProfile`: atomLib.atomLibStrings.default | atomLib.atomLibStrings.srgb,
    `core.customFileTypes`: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    `core.destroyEmptyPanes`: scala.Boolean,
    `core.disabledPackages`: js.Array[java.lang.String],
    `core.excludeVcsIgnoredPaths`: scala.Boolean,
    `core.fileEncoding`: FileEncoding,
    `core.fileSystemWatcher`: atomLib.atomLibStrings.native | atomLib.atomLibStrings.experimental | atomLib.atomLibStrings.poll | atomLib.atomLibStrings.atom,
    `core.followSymlinks`: scala.Boolean,
    `core.ignoredNames`: js.Array[java.lang.String],
    `core.openEmptyEditorOnStart`: scala.Boolean,
    `core.reopenProjectMenuCount`: scala.Double,
    `core.restorePreviousWindowsOnStart`: atomLib.atomLibStrings.no | atomLib.atomLibStrings.yes | atomLib.atomLibStrings.always,
    `core.telemetryConsent`: atomLib.atomLibStrings.limited | atomLib.atomLibStrings.no | atomLib.atomLibStrings.undecided,
    `core.themes`: js.Array[java.lang.String],
    `core.useProxySettingsWhenCallingApm`: scala.Boolean,
    `core.useTreeSitterParsers`: scala.Boolean,
    `core.versionPinnedPackages`: js.Array[java.lang.String],
    `core.warnOnLargeFileLimit`: scala.Double,
    `editor.atomicSoftTabs`: scala.Boolean,
    `editor.autoIndent`: scala.Boolean,
    `editor.autoIndentOnPaste`: scala.Boolean,
    `editor.confirmCheckoutHeadRevision`: scala.Boolean,
    `editor.fontFamily`: java.lang.String,
    `editor.fontSize`: scala.Double,
    `editor.invisibles`: Invisibles,
    `editor.lineHeight`: java.lang.String | scala.Double,
    `editor.maxScreenLineLength`: scala.Double,
    `editor.nonWordCharacters`: java.lang.String,
    `editor.preferredLineLength`: scala.Double,
    `editor.scrollPastEnd`: scala.Boolean,
    `editor.scrollSensitivity`: scala.Double,
    `editor.showCursorOnSelection`: scala.Boolean,
    `editor.showIndentGuide`: scala.Boolean,
    `editor.showInvisibles`: scala.Boolean,
    `editor.showLineNumbers`: scala.Boolean,
    `editor.softTabs`: scala.Boolean,
    `editor.softWrap`: scala.Boolean,
    `editor.softWrapAtPreferredLineLength`: scala.Boolean,
    `editor.softWrapHangingIndent`: scala.Double,
    `editor.tabLength`: scala.Double,
    `editor.tabType`: atomLib.atomLibStrings.auto | atomLib.atomLibStrings.soft | atomLib.atomLibStrings.hard,
    `editor.undoGroupingInterval`: scala.Double,
    `editor.zoomFontWhenCtrlScrolling`: scala.Boolean,
    StringDictionary: // tslint:disable-next-line:no-any
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `editor.commentEnd`: java.lang.String = null,
    `editor.commentStart`: java.lang.String = null,
    `editor.decreaseIndentPattern`: java.lang.String = null,
    `editor.foldEndPattern`: java.lang.String = null,
    `editor.increaseIndentPattern`: java.lang.String = null
  ): ConfigValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("core.allowPendingPaneItems")(`core.allowPendingPaneItems`)
    __obj.updateDynamic("core.audioBeep")(`core.audioBeep`)
    __obj.updateDynamic("core.automaticallyUpdate")(`core.automaticallyUpdate`)
    __obj.updateDynamic("core.closeDeletedFileTabs")(`core.closeDeletedFileTabs`)
    __obj.updateDynamic("core.closeEmptyWindows")(`core.closeEmptyWindows`)
    __obj.updateDynamic("core.colorProfile")(`core.colorProfile`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.customFileTypes")(`core.customFileTypes`)
    __obj.updateDynamic("core.destroyEmptyPanes")(`core.destroyEmptyPanes`)
    __obj.updateDynamic("core.disabledPackages")(`core.disabledPackages`)
    __obj.updateDynamic("core.excludeVcsIgnoredPaths")(`core.excludeVcsIgnoredPaths`)
    __obj.updateDynamic("core.fileEncoding")(`core.fileEncoding`)
    __obj.updateDynamic("core.fileSystemWatcher")(`core.fileSystemWatcher`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.followSymlinks")(`core.followSymlinks`)
    __obj.updateDynamic("core.ignoredNames")(`core.ignoredNames`)
    __obj.updateDynamic("core.openEmptyEditorOnStart")(`core.openEmptyEditorOnStart`)
    __obj.updateDynamic("core.reopenProjectMenuCount")(`core.reopenProjectMenuCount`)
    __obj.updateDynamic("core.restorePreviousWindowsOnStart")(`core.restorePreviousWindowsOnStart`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.telemetryConsent")(`core.telemetryConsent`.asInstanceOf[js.Any])
    __obj.updateDynamic("core.themes")(`core.themes`)
    __obj.updateDynamic("core.useProxySettingsWhenCallingApm")(`core.useProxySettingsWhenCallingApm`)
    __obj.updateDynamic("core.useTreeSitterParsers")(`core.useTreeSitterParsers`)
    __obj.updateDynamic("core.versionPinnedPackages")(`core.versionPinnedPackages`)
    __obj.updateDynamic("core.warnOnLargeFileLimit")(`core.warnOnLargeFileLimit`)
    __obj.updateDynamic("editor.atomicSoftTabs")(`editor.atomicSoftTabs`)
    __obj.updateDynamic("editor.autoIndent")(`editor.autoIndent`)
    __obj.updateDynamic("editor.autoIndentOnPaste")(`editor.autoIndentOnPaste`)
    __obj.updateDynamic("editor.confirmCheckoutHeadRevision")(`editor.confirmCheckoutHeadRevision`)
    __obj.updateDynamic("editor.fontFamily")(`editor.fontFamily`)
    __obj.updateDynamic("editor.fontSize")(`editor.fontSize`)
    __obj.updateDynamic("editor.invisibles")(`editor.invisibles`)
    __obj.updateDynamic("editor.lineHeight")(`editor.lineHeight`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.maxScreenLineLength")(`editor.maxScreenLineLength`)
    __obj.updateDynamic("editor.nonWordCharacters")(`editor.nonWordCharacters`)
    __obj.updateDynamic("editor.preferredLineLength")(`editor.preferredLineLength`)
    __obj.updateDynamic("editor.scrollPastEnd")(`editor.scrollPastEnd`)
    __obj.updateDynamic("editor.scrollSensitivity")(`editor.scrollSensitivity`)
    __obj.updateDynamic("editor.showCursorOnSelection")(`editor.showCursorOnSelection`)
    __obj.updateDynamic("editor.showIndentGuide")(`editor.showIndentGuide`)
    __obj.updateDynamic("editor.showInvisibles")(`editor.showInvisibles`)
    __obj.updateDynamic("editor.showLineNumbers")(`editor.showLineNumbers`)
    __obj.updateDynamic("editor.softTabs")(`editor.softTabs`)
    __obj.updateDynamic("editor.softWrap")(`editor.softWrap`)
    __obj.updateDynamic("editor.softWrapAtPreferredLineLength")(`editor.softWrapAtPreferredLineLength`)
    __obj.updateDynamic("editor.softWrapHangingIndent")(`editor.softWrapHangingIndent`)
    __obj.updateDynamic("editor.tabLength")(`editor.tabLength`)
    __obj.updateDynamic("editor.tabType")(`editor.tabType`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.undoGroupingInterval")(`editor.undoGroupingInterval`)
    __obj.updateDynamic("editor.zoomFontWhenCtrlScrolling")(`editor.zoomFontWhenCtrlScrolling`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`editor.commentEnd` != null) __obj.updateDynamic("editor.commentEnd")(`editor.commentEnd`)
    if (`editor.commentStart` != null) __obj.updateDynamic("editor.commentStart")(`editor.commentStart`)
    if (`editor.decreaseIndentPattern` != null) __obj.updateDynamic("editor.decreaseIndentPattern")(`editor.decreaseIndentPattern`)
    if (`editor.foldEndPattern` != null) __obj.updateDynamic("editor.foldEndPattern")(`editor.foldEndPattern`)
    if (`editor.increaseIndentPattern` != null) __obj.updateDynamic("editor.increaseIndentPattern")(`editor.increaseIndentPattern`)
    __obj.asInstanceOf[ConfigValues]
  }
}

