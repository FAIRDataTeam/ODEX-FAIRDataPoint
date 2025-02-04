package nl.dtls.fairdatapoint.aoipmh;

/**
 * API for implementing a repository of sets.
 * It is possible to have a data provider without sets.
 *
 * @author Development @ Lyncode
 * @author Shamanou van Leeuwen
 */
public interface SetRepository {

    /**
     * Checks if the actual data source supports sets.
     *
     * @return Supports sets?
     */
    public boolean supportSets();

    /**
     * Returns a paged list of sets.
     * It is common to use a partial result of 100 sets however, in XOAI this is a configured parameter.
     *
     * @param offset Starting offset
     * @param length Max size of the returned list
     * @return List of Sets
     */
    public ListSetsResult retrieveSets(int offset, int length);

    /**
     * Checks if a specific sets exists in the data source.
     *
     * @param setSpec Set spec
     * @return Set exists
     * @see <a href="client://www.openarchives.org/OAI/openarchivesprotocol.html#Set">Set definition</a>
     */
    public boolean exists(String setSpec);
}
