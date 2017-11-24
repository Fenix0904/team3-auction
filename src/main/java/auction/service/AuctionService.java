package auction.service;

import auction.domain.Auction;
import auction.domain.Category;
import auction.domain.Lot;

import java.util.List;

public interface AuctionService {

    void createAuction(Auction auction);

    void updateAuction(Auction auction);

    void deleteAuction(int auctionId);

    void changeAuctionStatus(int statusId, int auctionId);

    List<Auction> getAllAuctions();
}
