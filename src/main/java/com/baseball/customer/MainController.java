package com.baseball.customer;
// package com.baseball.baseball.customer;

// import com.example.demo.bean.DuelExp;
// import com.example.demo.bean.Match;
// import com.example.demo.bean.Tournament;
// import com.example.demo.dao.DuelDAO;
// import com.example.demo.dao.MatchDAO;
// import com.example.demo.dao.TournamentDAO;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;

// import java.util.ArrayList;
// import java.util.List;

// @Controller
// public class MainController {

//     @GetMapping("/customer/main")
//     public String showMain(Model model) {
//         List<Match> matchList = new ArrayList<>();
//         List<Tournament> tournamentList = new ArrayList<>();
//         List<List<DuelExp>> duelList = new ArrayList<>();
//         Tournament tournament = null;

//         MatchDAO matchDAO = new MatchDAO();
//         DuelDAO duelDAO = new DuelDAO();
//         TournamentDAO tournamentDAO = new TournamentDAO();

//         try {
//             // トーナメント情報の取得
//             tournamentList = tournamentDAO.getTournamentDetail();

//             if (!tournamentList.isEmpty()) {
//                 // 最後に登録されたトーナメントのIDを使って試合情報を取得
//                 Tournament latestTournament = tournamentList.get(tournamentList.size() - 1);
//                 matchList = matchDAO.searchMatchTournament(latestTournament.getTournamentId());

//                 // Duel情報の取得
//                 for (Match match : matchList) {
//                     List<DuelExp> duels = new ArrayList<>();
//                     duels.add(duelDAO.getDuelDetail(match.getDuel1()));
//                     duels.add(duelDAO.getDuelDetail(match.getDuel2()));
//                     duels.add(duelDAO.getDuelDetail(match.getDuel3()));
//                     duels.add(duelDAO.getDuelDetail(match.getDuel4()));
//                     duelList.add(duels);
//                 }

//                 tournament = latestTournament;
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

//         // モデルにデータを渡す
//         model.addAttribute("tournament", tournament);
//         model.addAttribute("duelList", duelList);
//         model.addAttribute("matchList", matchList);

//         return "customer/main"; // templates/customer/main.html
//     }
// }
