import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Tester {

    private Tester() {}

    public static void shuffle(Question[] array){
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Question temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public Question[] createTest1() {
        Question[] questions = new Question[15];

        questions[0] = new Question("Using 'store and forward' packet processing on a route only starts " +
                "after the full packet is received.", true);
        questions[1] = new Question("WLAN is using a guided media for transmission", false);
        questions[2] = new Question("Client and server are part of the network core", false);
        questions[3] = new Question("A protocol is fully described by the format and order of messages " +
                "and expected actions", true);
        questions[4] = new Question("The internet is a network of networks", true);
        questions[5] = new Question("Routing can only be done when the forewarning is done", false);
        questions[6] = new Question("Various multiplexing technologies (e.g. TDM, FDM) can be combined " +
                "for packet transmission", true);
        questions[7] = new Question("Packet switched networks offer guaranteed resources to a network " +
                "transmission", false);
        questions[8] = new Question("The transmission delay of a packet increases if the link length " +
                "increases", false);
        questions[9] = new Question("If the arrival rate of packets on a router is  faster then the " +
                "processing rate the packet is queued.", true);
        questions[10] = new Question("An Internet Exchange Point (IXP) connects access networks to " +
                "their ISPs", false);
        questions[11] = new Question("Peering is the direct exchange between two ISPs", true);
        questions[12] = new Question("Tier 1 ISPs are providing wide range connectivity (e.g. undersea " +
                "cables) to regional ISPs", true);
        questions[13] = new Question("Wide-area cellular networks are called access networks", true);
        questions[14] = new Question("The local forwarding table in a router contains the full path " +
                "through the network to each destination", false);
        shuffle(questions);
        return questions;
    }
    public Question[] createTest2() {
        Question[] questions = new Question[15];

        questions[0] = new Question("The propagation delay increases when the physical length of a link is " +
                "increased", true);
        questions[1] = new Question("The transmission delay of a router is dependent on the current " +
                "utilization of the device", false);
        questions[2] = new Question("The queuing delay of a router is constant over time", false);
        questions[3] = new Question("The processing delay of a router is usually rather small as compared " +
                "to other types of delay within a transmission", true);
        questions[4] = new Question("Due to the layering concept introducing new application layer " +
                "protocols require changes in the network core", false);
        questions[5] = new Question("In the IP datagram header the destination address is the address of " +
                "the next physical hop of the data transmission", false);
        questions[6] = new Question("Source and destination address are part of the IP datagram header"
                , true);
        questions[7] = new Question("Subnet masks other then /8, /16, /24 are only possible with classless " +
                "inter domain routing (CIDR)", true);
        questions[8] = new Question("10.5.3.0/24 is within the 10.5.0.0/16 subnet", true);
        questions[9] = new Question("An IPv4 network with a /24 subnet mask allows up to 2^8 client " +
                "addresses", false);
        questions[10] = new Question("For up to 300 clients within one subnet a network with a subnet " +
                "mask of /23 or lower is required", true);
        questions[11] = new Question("In order to get the MAC (medium access control) address of a device " +
                "the ARP (address resolution protocol) is used", true);
        questions[12] = new Question("In case a packet needs to be transferred to a different subnet a " +
                "router is needed and addressed as the next hop in the link layer header", true);
        questions[13] = new Question("VLANs allow a logical separation of data transfer within a shared " +
                "physical network", true);
        questions[14] = new Question("Data transfer between two clients is possible when they are " +
                "connected to the same switch even if they are assigned to different VLANs", false);

        shuffle(questions);
        return questions;
    }
    public Question[] createTest3() {
        Question[] questions = new Question[15];

        questions[0] = new Question("The link layer is responsible for handling the communication between " +
                "physically adjacent nodes (e.g. clients, router)", true);
        questions[1] = new Question("In order to resolve the IP address out of a MAC address the Address " +
                "Resolution Protocol (ARP) is used", false);
        questions[2] = new Question("Link layer protocols provide a reliable end-to-end transfer across " +
                "the network", false);
        questions[3] = new Question("When a client changes to another subnet the MAC address stays the " +
                "same", true);
        questions[4] = new Question("Link layer protocols are specifically designed to work on the " +
                "underlying physical transmission medium", true);
        questions[5] = new Question("The switch table within a switch is self-learning during " +
                "operation", true);
        questions[6] = new Question("The switch table can only have one entry per outgoing port"
                , false);
        questions[7] = new Question("In case no entry in the switch table matches for a MAC address " +
                "the switch drops the frame", false);
        questions[8] = new Question("When sending a datagram to a different subnet the client address " +
                "the router on the link layer", true);
        questions[9] = new Question("During a transmission between two subnets the link layer addressing " +
                "(source & destination address) does not change", false);
        questions[10] = new Question("During a transmission between two subnets the network layer " +
                "addressing (source & destination address) does not change", true);
        questions[11] = new Question("The switch needs to be addressed on the link layer in case " +
                "it connects the client with the next-hop router", false);
        questions[12] = new Question("A client with multiple network interfaces (e.g. wireless, wired, " +
                "bluetooth) can have multiple MAC addresses", true);
        questions[13] = new Question("The link layer is implemented in routers", true);
        questions[14] = new Question("When connecting two network layer nodes (e.g. router, client) " +
                "multiple switches can be used one after the other", true);

        shuffle(questions);
        return questions;
    }
    public Question[] createTest4() {
        Question[] questions = new Question[15];

        questions[0] = new Question("The same routing algorithms are applied for intra-As and inter-AS " +
                "routing", false);
        questions[1] = new Question("An autonomous system (AS) consists of multiple routers operated " +
                "by the same network provider", true);
        questions[2] = new Question("OSPF is a distance vector routing protocol", false);
        questions[3] = new Question("Using BGP the forwarding tables can contain intra-AS as well as " +
                "inter-AS destinations", true);
        questions[4] = new Question("Routing protocols exchange information on the control plane",
                true);
        questions[5] = new Question("Dijkstra algorithm requires full knowledge about the nodes, edges, " +
                "and costs to be applied", true);
        questions[6] = new Question("In link-state-routing algorithms the information exchange only " +
                "happens between neighbours", false);
        questions[7] = new Question("After convergence of a distance vector routing, the nodes do not know" +
                " the full paths to each of the network nodes", true);
        questions[8] = new Question("The distance-vector-routing algorithm calculates the shortest path " +
                "based on full knowledge about the network topology", false);
        questions[9] = new Question("Using distance-vector-routing, every router broadcasts its distance " +
                "vector after an update", true);
        questions[10] = new Question("One of the main reasons NAT (Network Address Translation) was " +
                "invented is the shortage of IPv4 addresses", true);
        questions[11] = new Question("The usage of NAT (Network Address Translation) is a violation of the " +
                "end-to-end principle of the network layer", true);
        questions[12] = new Question("NAT (Network Address Translation) replaces the destination port and " +
                "IP of an outgoing packet", false);
        questions[13] = new Question("DHCP (Dynamic Host Configuration Protocol) provides information to " +
                "configure the link layer of the client", false);
        questions[14] = new Question("Message exchange of DHCP (Dynamic Host Configuration Protocol) " +
                "mainly uses broadcasts", true);

        shuffle(questions);
        return questions;
    }
    public Question[] createCustomTest1() {
        Question[] questions = new Question[25];

        questions[0] = new Question("Store-and-Forwarding forwards a packet, even if it has errors",
                false);
        questions[1] = new Question("Store-and-Forwarding ensures that only error-free packets are " +
                "forwarded", true);
        questions[2] = new Question("Packet Switching sends all packets on the same path to their " +
                "destination", false);
        questions[3] = new Question("Packet dropping is a consequence of the buffer size of a router " +
                "being overshot", true);
        questions[4] = new Question("When calculating the packet transmission delay, R / L is used",
                false);
        questions[5] = new Question("Circuit switching ensures a connection is reserved, even it is " +
                "idle.", true );
        questions[6] = new Question("Using circuit switching on a 1Gb/s network allows for 12 users at " +
                "100Mb/s to be active at the same time", false);
        questions[7] = new Question("Tier 1 ISPs can connect to each other using IXPs", true);
        questions[8] = new Question("Regional ISPs offer to connect access networks to IXPs", false);
        questions[9] = new Question("The queuing delay in a router can vary heavily depending on " +
                "circumstances", true);
        questions[10] = new Question("Decreasing the length of a physical link decreases the transmission " +
                "delay", false);
        questions[11] = new Question("Increasing the length of a physical link decreases the propagation " +
                "delay", false);
        questions[12] = new Question("Propagation delay is calculated using d / s, with d being distance " +
                "and s the router's processing ability", false);
        questions[13] = new Question("If the value for traffic intensity L*a / R is greater than 1, then " +
                "the average delay is infinite", true);
        questions[14] = new Question("The average throughput is limited by the sender of the packets",
                false);
        questions[15] = new Question("When speaking of the internet, conventionally only 5 layers are " +
                "used", true);
        questions[16] = new Question("A switch is a layer 3 device", false);
        questions[17] = new Question("The ISO/OSI reference model defines 7 layers", true);
        questions[18] = new Question("Radio used guided media for transmission", false);
        questions[19] = new Question("Forwarding is done on a local level, unlike routing which is done on " +
                "a global level", true);
        questions[20] = new Question("The TCP/IP model describes 7 layers.", false);
        questions[21] = new Question("The Data Link layer converts datagrams into segments", false);
        questions[22] = new Question("The Presentation Layer is the 3rd layer", false);
        questions[23] = new Question("UDP functions on the 4th layer", true);
        questions[24] = new Question("TCP only allows half-duplex communication", false);

        shuffle(questions);
        return questions;
    }
    public Question[] createCustomTest2() {
        Question[] questions = new Question[30];

        questions[0] = new Question("'FDM' allows for multiple transmissions to run at the same time",
                true);
        questions[1] = new Question("'TDM' allows for efficient use for multiple transmissions at the same" +
                " time", false);
        questions[2] = new Question("The physical layer is responsible for encapsulating frames into" +
                " bits for transmission", true);
        questions[3] = new Question("Encapsulation occurs only at the application layer", false);
        questions[4] = new Question("Encapsulation ensures that data is properly packaged and understood " +
                "by each layer at the receiving end", true);
        questions[5] = new Question("Ethernet uses guided media", true);
        questions[6] = new Question("A MAC address refers to a Macintosh computer", false);
        questions[7] = new Question("If ten PCs are connected to the same switch, but the first five are " +
                "assigned to VLAN 10 and the other five are assigned to VLAN 20, then they have been divided into two " +
                "different subnets", true);
        questions[8] = new Question("A 'ping' sends an ICMP Echo request", true);
        questions[9] = new Question("Compared to IPv4, IPv6 streamlines routing decisions and focuses on " +
                "scalability", true);
        questions[10] = new Question("IPv4 streamlines routing decisions more than IPv6", false);
        questions[11] = new Question("When sending a message through the Network layer, an IP header is " +
                "always attached", true);
        questions[12] = new Question("The 'version' field in an IP-header indicates the OS-version",
                false);
        questions[13] = new Question("The TTL field in the IP header acts as a safeguard against infinite " +
                "loops", true);
        questions[14] = new Question("Routing happens at Layer 3 of the OSI model", true);
        questions[15] = new Question("Forwarding happens at Layer 2 of the OSI model", false);
        questions[16] = new Question("Forwarding can happen on Layer 3 or 2 depending on context",
                true);
        questions[17] = new Question("An IP address is classless when it uses DHCP notation", false);
        questions[18] = new Question("Using CIDR allows for less wasteful subnetting", true);
        questions[19] = new Question("A new PC without an IP address sends out a broadcast message in order " +
                "to discover any DHCP servers on the local network", true);
        questions[20] = new Question("A client can DHCPREQUEST an IP not offered by a DHCP server",
                true);
        questions[21] = new Question("If a client requests an invalid IP from a DHCP server, it responds " +
                "with DHCPNAK", true);
        questions[22] = new Question("Given a packet for the destination IP 192.168.1.130, a router " +
                "following longest prefix matching would choose 192.168.1.0/24 255.255.255.0 " +
                "over 192.168.1.128/25 255.255.255.128, as the next-hop",false);
        questions[23] = new Question("The end-to-end argument suggests that functions like error checking " +
                "should be done at the end-host, not in the middle of the network (routers, switches)", true);
        questions[24] = new Question("NAT is useful due to the current IPv6 shortage", false);
        questions[25] = new Question("A MAC address is 48 bits long", true);
        questions[26] = new Question("Two PCs would have the same MAC address if they are made by the same " +
                "manufacturer", false);
        questions[27] = new Question("If a host does not know the destinations MAC-address on the LAN, but " +
                " knows the IP address, then it broadcasts an ARP request. ", true);
        questions[28] = new Question("ARP operates only within a single subnet but switches can act as " +
                "intermediaries between subnets", false);
        questions[29] = new Question("ARP is a layer 2 protocol, but it plays a supporting role for layer 3 " +
                "communication", true);

        shuffle(questions);
        return questions;
    }
    public Question[] createCustomTest3() {
        Question[] questions = new Question[13];

        questions[0] = new Question("On the link layer hosts and routers act as nodes", true);
        questions[1] = new Question("For the purposes of the 2nd layer, switches act as nodes", false);
        questions[2] = new Question("link layer has responsibility of transferring datagram from one node " +
                "to physically adjacent node over a link", true);
        questions[3] = new Question("Datagrams can be transferred by different link protocols (first WIFI, " +
                "then Ethernet", true);
        questions[4] = new Question("In the frame header, the TTL is added to its field", false);
        questions[5] = new Question("The link layer uses MAC addresses to navigate globally", false);
        questions[6] = new Question("FF-FF-FF-FF-FF-FF is the broadcast MAC address", true);
        questions[7] = new Question("A router will broadcast all ARP requests it receives", false);
        questions[8] = new Question("Modern ethernet uses a bus-based topology", false);
        questions[9] = new Question("Ethernet is unreliable and connectionless", true);
        questions[10] = new Question("Switches are transparent to higher level protocols", true);
        questions[11] = new Question("Each link to a switch is its own collision domain", true);
        questions[12] = new Question("A switch will always flood when an ARP request arrives", false);

        shuffle(questions);
        return questions;
    }
    public Question[] createMergedTest(Question[] first, Question[] second) {
        int totalLength = first.length + second.length;
        Question[] mergedArray = (Question[]) Array.newInstance(first.getClass().getComponentType(), totalLength);
        System.arraycopy(first, 0, mergedArray, 0, first.length);
        System.arraycopy(second, 0, mergedArray, first.length, second.length);
        shuffle(mergedArray);
        return mergedArray;
    }
    public Question[] createSuperTest() {
        Question[] meat = createMergedTest(createTest1(), createTest2());
        Question[] soup = createMergedTest(createTest3(), createTest4());
        return createMergedTest(meat, soup);
    }
    public Question[] createCustomSuperTest() {
        Question[] snack = createMergedTest(createCustomTest1(), createCustomTest2());
        return createMergedTest(snack, createCustomTest3());
    }
    public Question[] createUltraTest(){
        Question[] first = createMergedTest(createCustomTest1(), createTest1());
        Question[] second = createMergedTest(createCustomTest2(), createTest2());
        Question[] third = createMergedTest(createCustomTest3(), createTest3());
        Question[] soup = createMergedTest(first, second);
        Question [] meat = createMergedTest(third, createTest4());
        return createMergedTest(soup, meat);
    }

    public boolean checkAnswer(int answer, Question question) {
        if (answer == 1) return question.getAnswer();
        else return !question.getAnswer();
    }
    public static void logic(){
        Tester dude = new Tester();
        Scanner scanner = new Scanner(System.in);
        int test;
        System.out.println("Please pick a lecture test. 1/2/3/4/5/6 (Pick 6 for more information)");
        System.out.print("> ");
        test = scanner.nextInt();
        if (test == 6) {
            System.out.println("This program was created by Taliesin Talab as an aid to study for the Digital " +
                    "Communications exam.\nIt is not intended to be relied upon as the main tool to study and is " +
                    "imperfect.\nIf you find mistakes, you're welcome to correct them in your local version of the " +
                    "tester.\n\nThe lecture test options are based on the Moodle-lecture tests.\nAll questions from " +
                    "moodle are included and as an additional option, you can include the questions I wrote myself.\n" +
                    "Lecture test 5 (aka the Super Test) merges all questions together and runs them at the same time." +
                    "\nPick 0 when selecting a lecture test, to stop the program." +
                    "\nAll questions are True(1) or False(2). Writing any number except 1 or 0 might result in error\n");
            return;
        }
        if (test == 1) {
            System.out.println("Lecture test 1 selected.\nPlease pick from the following options:\n" +
                    "1. Standard Moodle Lecture Test\n" +
                    "2. Custom Lecture Test\n" +
                    "3. Merged (Moodle + Custom) Test\n");
            System.out.print("> ");
            test = scanner.nextInt();
            if (test == 1) {dude.runTest(dude.createTest1());}
            if (test == 2) {dude.runTest(dude.createCustomTest1());}
            if (test == 3) {dude.runTest(dude.createMergedTest(dude.createTest1(), dude.createCustomTest1()));}
            return;
        }
        if (test == 2) {
            System.out.println("Lecture test 2 selected.\nPlease pick from the following options:\n" +
                    "1. Standard Moodle Lecture Test\n" +
                    "2. Custom Lecture Test\n" +
                    "3. Merged (Moodle + Custom) Test\n");
            System.out.print("> ");
            test = scanner.nextInt();
            if (test == 1) {dude.runTest(dude.createTest2());}
            if (test == 2) {dude.runTest(dude.createCustomTest2());}
            if (test == 3) {dude.runTest(dude.createMergedTest(dude.createTest2(), dude.createCustomTest2()));}
            return;
        }
        if (test == 3) {
            System.out.println("Lecture test 3 selected.\nPlease pick from the following options:\n" +
                    "1. Standard Moodle Lecture Test\n" +
                    "2. Custom Lecture Test\n" +
                    "3. Merged (Moodle + Custom) Test\n");
            System.out.print("> ");
            test = scanner.nextInt();
            if (test == 1) {dude.runTest(dude.createTest3());}
            if (test == 2) {dude.runTest(dude.createCustomTest3());}
            if (test == 3) {dude.runTest(dude.createMergedTest(dude.createTest3(), dude.createCustomTest3()));}
            return;
        }
        if (test == 4) {
            System.out.println("Lecture test 4 selected.\nThis option does not have any custom questions\n");
            dude.runTest(dude.createTest4());
            return;
        }
        if (test == 5) {
            System.out.println("Super Test option selected.\nPlease pick from the following options:\n" +
                    "1. Standard Moodle Lecture Super Test\n" +
                    "2. Custom Lecture Super Test\n" +
                    "3. Merged (Moodle + Custom) Super Test\n");
            System.out.print("> ");
            test = scanner.nextInt();
            if (test == 1) {dude.runTest(dude.createSuperTest());}
            if (test == 2) {dude.runTest(dude.createCustomSuperTest());}
            if (test == 3) {dude.runTest(dude.createUltraTest());}
            return;
        }
        if (test == 0) {
            System.exit(0);
        }
    }
    public void runTest(Question[] test){
        Scanner scanner = new Scanner(System.in);
        String line = "Type 1 for True or Type 0 for False";
        int score = 0;
        int total = 0;
        Question[] wrong = new Question[test.length];
        int wrongs = 0;

        System.out.println("Exam is starting.\n");
        for (Question question : test) {
            int choice;
            total++;
            System.out.println(question.getDescription());
            System.out.println(line);
            System.out.print("Answer: ");
            choice = scanner.nextInt();
            if (checkAnswer(choice, test[total-1])) {
                System.out.println("Correct!\n");
                score++;
            }
            if (!checkAnswer(choice, test[total-1])) {
                wrong[wrongs] = question;
                wrongs++;
                System.out.printf("Wrong! Correct Answer: %s\n\n", question.getAnswer());
            }
        }
        System.out.println("\nThe test has ended.\nYour score is: " + score);
        System.out.println("The total possible points is: " + total);
        if (wrongs > 0) {
            System.out.println("\nThe following questions were answered wrong:");
            for (int i = 0; i < wrongs; i++) {
                System.out.println(wrong[i].getDescription() + ":");
                System.out.println("Correct Answer: " + wrong[i].getAnswer() + "\n");
                if (wrong[i+1] == null) break;
            }
        }
        else {
            System.out.println("You had no errors! Good job buddy");
        }
    }
}