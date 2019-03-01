package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interfaces enables the object to access personal dictionaries.
  *
  * Personal dictionaries are used to supply additional information for spell checking and hyphenation (see {@link
  * com.sun.star.linguistic2.XDictionaryEntry} ). Only active dictionaries with an appropriate language are used for that purpose. The entries of an
  * active, positive dictionary are words that are required to be recognized as correct during the spell checking process. Additionally, they will be used
  * for hyphenation. Entries of a negative dictionary are required to be recognized as negative words, for example, words that should not be used, during
  * SPELLCHECK. An entry in a negative dictionary may supply a proposal for a word to be used instead of the one being used.
  * @see com.sun.star.linguistic2.XDictionaryEvent
  * @see com.sun.star.container.XNamed
  */
trait XDictionary
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /** @returns the number of entries in the dictionary. */
  val Count: scala.Double
  /**
    * returns the type of the dictionary.
    * @returns the type of the dictionary.
    * @see com.sun.star.linguistic2.DictionaryType
    */
  val DictionaryType: DictionaryType
  /**
    * This function should no longer be used since with the expansion of the maximum number of allowed entries the result may become unreasonable large!
    * @deprecated Deprecated
    * @returns a sequence with all the entries of the dictionary.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.XSearchableDictionary
    */
  val Entries: activexDashInteropLib.SafeArray[XDictionaryEntry]
  /**
    * @returns the language of the dictionary.
    * @see com.sun.star.lang.Locale
    */
  var Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * is used to make an entry in the dictionary.
    *
    * If an entry already exists, the dictionary remains unchanged and `FALSE` will be returned.
    *
    * In positive dictionaries only positive entries can be made, and in negative ones only negative entries.
    * @param aWord the word to be added.
    * @param bIsNegative specifies whether the entry will be a negative one or not.
    * @param aRplcText in the case of a negative entry, this is the replacement text to be used when replacing aWord. Otherwise, it is undefined.
    * @returns `TRUE` if the entry was successfully added, `FALSE` otherwise.
    * @see com.sun.star.linguistic2.DictionaryType
    */
  def add(aWord: java.lang.String, bIsNegative: scala.Boolean, aRplcText: java.lang.String): scala.Boolean
  /**
    * adds an entry to the list of dictionary event listeners.
    *
    * On dictionary events, each entry in the listener list will be notified via a call to {@link
    * com.sun.star.linguistic2.XDictionaryEventListener.processDictionaryEvent()} .
    * @param xListener the entry to be made, that is, the object that wants notifications.
    * @returns `TRUE` if the entry was successfully made, `FALSE` otherwise. If {@link com.sun.star.lang.XEventListener.disposing()} was called before, it will
    * @see com.sun.star.linguistic2.XDictionary.removeDictionaryEventListener()
    * @see com.sun.star.linguistic2.XDictionaryEventListener
    */
  def addDictionaryEventListener(xListener: XDictionaryEventListener): scala.Boolean
  /**
    * is used to add an entry to the dictionary.
    *
    * If an entry already exists, the dictionary remains unchanged and `FALSE` will be returned.
    *
    * In positive dictionaries only positive entries can be made, and in negative ones only negative entries.
    * @param xDicEntry the entry to be added.
    * @returns `TRUE` if the entry was successfully added `FALSE` otherwise.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.DictionaryType
    */
  def addEntry(xDicEntry: XDictionaryEntry): scala.Boolean
  /** removes all entries from the dictionary. */
  def clear(): scala.Unit
  /** @returns the number of entries in the dictionary. */
  def getCount(): scala.Double
  /**
    * returns the type of the dictionary.
    * @returns the type of the dictionary.
    * @see com.sun.star.linguistic2.DictionaryType
    */
  def getDictionaryType(): DictionaryType
  /**
    * This function should no longer be used since with the expansion of the maximum number of allowed entries the result may become unreasonable large!
    * @deprecated Deprecated
    * @returns a sequence with all the entries of the dictionary.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.XSearchableDictionary
    */
  def getEntries(): activexDashInteropLib.SafeArray[XDictionaryEntry]
  /**
    * searches for an entry that matches the given word.
    * @param aWord the word to be looked for.
    * @returns the reference to the entry found. If no entry was found, it is NULL.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    */
  def getEntry(aWord: java.lang.String): XDictionaryEntry
  /**
    * @returns the language of the dictionary.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns `TRUE` if the dictionary is active, `FALSE` otherwise. */
  def isActive(): scala.Boolean
  /** @returns `TRUE` if the dictionary is full and no further entry can be made, `FALSE` otherwise. */
  def isFull(): scala.Boolean
  /**
    * removes an entry from the dictionary.
    * @param aWord the word matching the entry to be removed.
    * @returns `TRUE` if the entry was successfully removed, `FALSE` otherwise (especially if the entry was not found).
    */
  def remove(aWord: java.lang.String): scala.Boolean
  /**
    * removes an entry from the list of dictionary event listeners.
    * @param xListener the reference to the listening object to be removed.
    * @returns `TRUE` if the object to be removed was found and removed, `FALSE` if the object was not found in the list.
    * @see com.sun.star.linguistic2.XDictionary.addDictionaryEventListener()
    * @see com.sun.star.linguistic2.XDictionaryEventListener
    */
  def removeDictionaryEventListener(xListener: XDictionaryEventListener): scala.Boolean
  /**
    * specifies whether the dictionary should be used or not .
    * @param bActivate `TRUE` if the dictionary should be used, `FALSE` otherwise.
    */
  def setActive(bActivate: scala.Boolean): scala.Unit
  /**
    * is used to set the language of the dictionary.
    * @param aLocale the new language of the dictionary.
    * @see com.sun.star.lang.Locale
    */
  def setLocale(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
}

object XDictionary {
  @scala.inline
  def apply(
    Count: scala.Double,
    DictionaryType: DictionaryType,
    Entries: activexDashInteropLib.SafeArray[XDictionaryEntry],
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    add: js.Function3[java.lang.String, scala.Boolean, java.lang.String, scala.Boolean],
    addDictionaryEventListener: js.Function1[XDictionaryEventListener, scala.Boolean],
    addEntry: js.Function1[XDictionaryEntry, scala.Boolean],
    clear: js.Function0[scala.Unit],
    getCount: js.Function0[scala.Double],
    getDictionaryType: js.Function0[DictionaryType],
    getEntries: js.Function0[activexDashInteropLib.SafeArray[XDictionaryEntry]],
    getEntry: js.Function1[java.lang.String, XDictionaryEntry],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getName: js.Function0[java.lang.String],
    isActive: js.Function0[scala.Boolean],
    isFull: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[java.lang.String, scala.Boolean],
    removeDictionaryEventListener: js.Function1[XDictionaryEventListener, scala.Boolean],
    setActive: js.Function1[scala.Boolean, scala.Unit],
    setLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): XDictionary = {
    val __obj = js.Dynamic.literal(Count = Count, DictionaryType = DictionaryType, Entries = Entries, Locale = Locale, Name = Name, acquire = acquire, add = add, addDictionaryEventListener = addDictionaryEventListener, addEntry = addEntry, clear = clear, getCount = getCount, getDictionaryType = getDictionaryType, getEntries = getEntries, getEntry = getEntry, getLocale = getLocale, getName = getName, isActive = isActive, isFull = isFull, queryInterface = queryInterface, release = release, remove = remove, removeDictionaryEventListener = removeDictionaryEventListener, setActive = setActive, setLocale = setLocale, setName = setName)
  
    __obj.asInstanceOf[XDictionary]
  }
}

