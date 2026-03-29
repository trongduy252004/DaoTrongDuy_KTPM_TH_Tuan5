public class TransactionRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return GenderContext.get(); // Trả về "MALE" hoặc "FEMALE"
    }
}