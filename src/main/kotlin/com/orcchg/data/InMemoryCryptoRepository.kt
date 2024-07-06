package com.orcchg.data

import com.orcchg.domain.CryptoRepository
import com.orcchg.domain.model.Coin
import com.orcchg.domain.model.CoinsPage

internal class InMemoryCryptoRepository(
    private val coinPriceRepository: CoinPriceRepository
) : CryptoRepository {

    override suspend fun coins(limit: Int, offset: Int): CoinsPage {
        if (limit < 0 || offset < 0) {
            throw IllegalArgumentException("limit $limit and offset $offset must not be negative")
        }
        if (limit == 0 || offset >= allCoins.size) {
            return CoinsPage(offset = offset, total = allCoins.size)
        }

        val beyondLast = (offset + limit).coerceAtMost(allCoins.size)
        val pricedCoins = allCoins.subList(fromIndex = offset, toIndex = beyondLast)
            .mapNotNull { coin -> coinPriceRepository.getPrice(index = coin.index) }

        return CoinsPage(coins = pricedCoins, offset = offset, total = allCoins.size)
    }

    private val allCoins = listOf(
        Coin.Bitcoin, Coin.Litecoin, Coin.Dogecoin, Coin.Dash, Coin.Viacoin,
        Coin.Groestlcoin, Coin.DigiByte, Coin.Monacoin, Coin.Decred, Coin.Syscoin,
        Coin.Ethereum, Coin.EthereumClassic, Coin.Icon, Coin.Verge, Coin.CosmosHub,
        Coin.Pivx, Coin.Zen, Coin.Zcash, Coin.Firo, Coin.Rootstock, Coin.Komodo,
        Coin.Ripple, Coin.BitcoinCash, Coin.Nebl, Coin.Stellar, Coin.BitcoinGold,
        Coin.Nano, Coin.MantaPacific, Coin.Ravencoin, Coin.PoaNetwork, Coin.Eos,
        Coin.Tron, Coin.OpBNB, Coin.InternetComputer, Coin.Fio, Coin.Nimiq,
        Coin.Algorand, Coin.Iost, Coin.IoTeX, Coin.Nervos, Coin.Zilliqa,
        Coin.TerraClassic, Coin.Polkadot, Coin.ThetaFuel, Coin.CryptoOrg,
        Coin.Everscale, Coin.Near, Coin.Aion, Coin.Kusama, Coin.Aeternity,
        Coin.Kava, Coin.Filecoin, Coin.Oasis, Coin.Bluzelle, Coin.BandChain,
        Coin.Theta, Coin.Solana, Coin.MultiversX, Coin.Secret, Coin.Agoric,
        Coin.Ton, Coin.Aptos, Coin.BNBBeaconChain, Coin.Sui, Coin.Acala,
        Coin.VeChain, Coin.Callisto, Coin.Neo, Coin.Viction, Coin.ECash,
        Coin.THORChain, Coin.Polygon, Coin.OKXChain, Coin.BitcoinDiamond,
        Coin.ThunderCore, Coin.Harmony, Coin.Ontology, Coin.ConfluxESpace,
        Coin.Tezos, Coin.Cardano, Coin.LightlinkPhoenix, Coin.Qtum, Coin.Nebulas,
        Coin.Hedera, Coin.Merlin, Coin.Mantle, Coin.BNBGreenfield, Coin.BounceBit,
        Coin.GoChain, Coin.ZenEon, Coin.Base, Coin.Nuls, Coin.Wax, Coin.Meter,
        Coin.Flux, Coin.Celo, Coin.Linea, Coin.Stratis, Coin.Scroll,
        Coin.ZkLinkNovaMainnet, Coin.Wanchain, Coin.Waves, Coin.CronosChain,
        Coin.NativeInjective, Coin.OPMainnet, Coin.GnosisChain, Coin.Osmosis,
        Coin.SmartBitcoinCash, Coin.Fantom, Coin.Boba, Coin.KuCoinCommunityChain,
        Coin.ZkSyncEra, Coin.Terra, Coin.HuobiECOChain, Coin.AcalaEVM, Coin.Coreum,
        Coin.Metis, Coin.PolygonZkEVM, Coin.Moonbeam, Coin.Moonriver, Coin.Ronin,
        Coin.KavaEvm, Coin.IoTeXEVM, Coin.NativeZetaChain, Coin.NativeCanto,
        Coin.Klaytn, Coin.AvalancheCChain, Coin.Evmos, Coin.ArbitrumNova,
        Coin.Arbitrum, Coin.Sommelier, Coin.FetchAI, Coin.MarsHub, Coin.Umee,
        Coin.Quasar, Coin.Persistence, Coin.Akash, Coin.Noble, Coin.Sei, Coin.Stargaze,
        Coin.BNBSmartChain, Coin.ZetaEVM, Coin.NativeEvmos, Coin.Celestia, Coin.DYdX,
        Coin.Juno, Coin.Tbnb, Coin.Stride, Coin.Axelar, Coin.Crescent, Coin.Kujira,
        Coin.Comdex, Coin.Neutron, Coin.Neon, Coin.Aurora
    )
}
